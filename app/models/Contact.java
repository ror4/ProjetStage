package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;


@Entity
public class Contact extends Model {
    public String firstName;
    public String lastName;
    public String email;
    public String telephoneNumber;
    public String description;

    @ManyToMany
    @JoinTable(name="Project_Contact")
    public List<Project> projects;

    @ManyToMany
    @JoinTable (name="Contact_Client")
    public List<Client> clients;
}
