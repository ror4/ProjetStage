package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class WorkingDayActivities extends Model {
    public Project project;
    public Profile profile;
    public enum Temps {
    }
}
