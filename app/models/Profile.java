package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Profile extends Model{
    public String name;
    public float dailyRate;
    public float daysSold;

    @ManyToMany
    @JoinTable(name="Project_Profile")
    public List<Project> projects;
}
