package models;

import org.joda.time.DateTime;
import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class WorkingDay extends Model {
    public Collaborator collaborator;
    public DateTime date;
}
