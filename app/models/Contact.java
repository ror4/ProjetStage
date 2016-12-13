package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Contact extends Model {
    public String firstName;
    public String lastName;
    public String email;
    public String telephoneNumber;
    public String description;

    @ManyToMany
    @JoinTable(name="Project_Contact")
    public Set<Project> projects;
}
