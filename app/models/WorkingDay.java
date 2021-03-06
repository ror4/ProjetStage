package models;


import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class WorkingDay extends Model {

    @ManyToOne
    public Collaborator collaborator;
    @Temporal(TemporalType.DATE)
    public Date dayDate;
    public String morningActivity1;
    public String morningActivity2;
    public String afternoonActivity1;
    public String afternoonActivity2;

}
