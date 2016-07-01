package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;
import models.Fruit;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

   public class Application extends Controller {

    private FormFactory formFactory;

    @Inject
    public Application(FormFactory formFactory) {
        this.formFactory = formFactory;
    }
    public Result home = Results.redirect(routes.Application.list(0));

    public Result index() {
        return home;
    }

    public Result list(int page) {
        return ok(
            views.html.index.render(Fruit.page(page, 8)));
    }

    public Result edit(Long id) {
        Form<Fruit> fruitForm = formFactory.form(Fruit.class).fill(Fruit.find.byId(id));
        return ok(views.html.editfruit.render(id, fruitForm)
        );
    }

    public Result doEdit(Long id) throws PersistenceException {
        Form<Fruit> fruitForm = formFactory.form(Fruit.class).bindFromRequest();
        if(fruitForm.hasErrors()) {
            return badRequest(views.html.editfruit.render(id, fruitForm));
        }
        Transaction tr = Ebean.beginTransaction();
        try {
            Fruit savedFruit = Fruit.find.byId(id);
            if (savedFruit != null) {
                Fruit newFruitData = fruitForm.get();
                savedFruit.description = newFruitData.description;
                savedFruit.sum = newFruitData.sum;
                savedFruit.name = newFruitData.name;
                savedFruit.update();
                flash("success", "Fruit " + fruitForm.get().name + " has been updated");
                tr.commit();
            }
        } finally {
            tr.end();
        }

        return home;
    }

    public Result add() {
        Form<Fruit> fruitForm = formFactory.form(Fruit.class);
        return ok(
                views.html.addfruit.render(fruitForm)
        );
    }
    public Result save() {
        Form<Fruit> fruitForm = formFactory.form(Fruit.class).bindFromRequest();
        if(fruitForm.hasErrors()) {
            return badRequest(views.html.addfruit.render(fruitForm));
        }
        fruitForm.get().save();
        flash("success", "Fruit " + fruitForm.get().name + " has been created");
        return home;
    }
    public Result delete(Long id) {
        Fruit.find.ref(id).delete();
        return home;
    }
    

}
            
