package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Profile extends Model{
    public String name;
    public float dailyRate;
    public float daysSold;


    @OneToMany (mappedBy = "profile")
    public Set<WorkingDayActivities> workingDayActivities;

    @ManyToMany
    @JoinTable(name="Project_Profile")
    public List<Project> projects;
}
