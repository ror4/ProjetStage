package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class WorkingDayActivities extends Model {
    public Project project;
    public Profile profile;
    public enum Time {

        // Je ne savais pas comment nommer les enums, à renommer.

        TIME_1(0.25),
        TIME_2(0.5),
        TIME_3(0.75),
        TIME_4(1);

        private final double value;
        Time(double value){
            this.value = value;
        }

        public double getValue() { return value; }
    }
}
