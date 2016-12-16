package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class SalariesHistory extends Model {
    @Temporal(TemporalType.DATE)
    public Date changeDate;
    public float salary;
    public String comments;

    @ManyToOne
    public Collaborator collaborator;
}
