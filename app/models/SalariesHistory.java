package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class SalariesHistory extends Model {

    public Date changeDate;
    public float salary;

    @ManyToOne
    public Collaborator collaborator;
}
