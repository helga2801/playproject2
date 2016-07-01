import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Module;
import controllers.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import play.ApplicationLoader;
import play.Environment;
import play.inject.guice.GuiceApplicationBuilder;
import play.inject.guice.GuiceApplicationLoader;
import play.mvc.Result;
import play.test.Helpers;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

// Use FixMethodOrder to run the tests sequentially
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FunctionalTest {

    @Inject
    play.Application application;

    @Before
    public void setup() {
        Module testModule = new AbstractModule() {
            @Override
            public void configure() {
                // Install custom test binding here
            }
        };

        GuiceApplicationBuilder builder = new GuiceApplicationLoader()
                .builder(new ApplicationLoader.Context(Environment.simple()))
                .overrides(testModule);
        Guice.createInjector(builder.applicationModule()).injectMembers(this);

        Helpers.start(application);
    }

    @After
    public void teardown() {
        Helpers.stop(application);
    }

    @Test
    public void redirectHomePage() {
        Result result = Helpers.route(application, Application.index());

        assertThat(result.status(), equalTo(Helpers.SEE_OTHER));
        assertThat(result.redirectLocation().get(), equalTo("/fruits"));
    }
    
    @Test
    public void listComputersOnTheFirstPage() {
        Result result =  Helpers.route(application, Application.list(0, "name", "asc", ""));

        assertThat(result.status(), equalTo(Helpers.OK));
        assertThat(Helpers.contentAsString(result), containsString("4 fruits found"));
    }
    
    @Test
    public void filterComputerByName() {
        Result result = Helpers.route(application, Application.list(0, "name", "asc", "Apple"));

        assertThat(result.status(), equalTo(Helpers.OK));
        assertThat(Helpers.contentAsString(result), containsString("13 fruits found"));
    }
    
    @Test
    public void createANewComputer() {
        Result result = Helpers.route(application, Application.save());

        assertThat(result.status(), equalTo(Helpers.BAD_REQUEST));

        Map<String,String> data = new HashMap<>();
        data.put("name", "FooBar");
        data.put("introduced", "badbadbad");


        String saveUrl = Application.save().url();
        result = Helpers.route(application, Helpers.fakeRequest().bodyForm(data).method("POST").uri(saveUrl));

        assertThat(result.status(), equalTo(Helpers.BAD_REQUEST));
        assertThat(Helpers.contentAsString(result), containsString("<option value=\"1\" selected >Apple Inc.</option>"));
        //  <input type="date" id="introduced" name="introduced" value="badbadbad" aria-describedby="introduced_info_0 introduced_error_0" aria-invalid="true" class="form-control">
        assertThat(Helpers.contentAsString(result), containsString("<input type=\"date\" id=\"introduced\" name=\"introduced\" value=\"badbadbad\" "));
        // <input type="text" id="name" name="name" value="FooBar" aria-describedby="name_info_0" required="true" class="form-control">
        assertThat(Helpers.contentAsString(result), containsString("<input type=\"text\" id=\"name\" name=\"name\" value=\"FooBar\" "));

        data.put("introduced", "2011-12-24");

        result = Helpers.route(
            application,
            Helpers.fakeRequest().bodyForm(data).method("POST").uri(saveUrl)
        );

        assertThat(result.status(), equalTo(Helpers.SEE_OTHER));
        assertThat(result.redirectLocation().get(), equalTo("/fruits"));
        assertThat(result.flash().get("success"), equalTo("Fruit FooBar has been created"));

        result = Helpers.route(application, Application.list(0, "name", "asc", "FooBar"));
        assertThat(result.status(), equalTo(Helpers.OK));
        assertThat(Helpers.contentAsString(result), containsString("One fruit found"));
    }
    
}
