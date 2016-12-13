package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WorkingDayActivities extends Model {

    @ManyToOne
    public Project project;

    @ManyToOne
    public Profile profile;

    public enum timeSpend {

        // Je ne savais pas comment nommer les enums, à renommer.

        TIME_SPEND_1(0.25),
        TIME_SPEND_2(0.5),
        TIME_SPEND_3(0.75),
        TIME_SPEND_4(1);

        private final double value;
        timeSpend(double value){
            this.value = value;
        }

        public double getValue() { return value; }
    }
}
