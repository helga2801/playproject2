package models;

import com.avaje.ebean.Model;
import com.avaje.ebean.PagedList;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Fruit extends Model {

	@Id
    public Long id;
    
    @Constraints.Required
    public String name;

    @Constraints.Required
    public String sum;

    @Constraints.Required
    public String description;

    public static Find<Long, Fruit> find = new Find<Long, Fruit>(){};

    public static PagedList<Fruit> page(int page, int pageSize) {
        return
            find.where()

                .findPagedList(page, pageSize);
    }

}

