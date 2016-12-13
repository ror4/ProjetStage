package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class WorkingDayActivities extends Model {
    public Project project;
    public Profile profile;
    public enum TEMPS {

        // Je ne savais pas comment nommer les enums, à renommer.

        TEMPS_1(0.25),
        TEMPS_2(0.5),
        TEMPS_3(0.75),
        TEMPS_4(1);

        private final double value;
        TEMPS(double value){
            this.value = value;
        }

        public double getValue() { return value; }
    }
}
