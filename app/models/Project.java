package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class Project extends Model {
    public String name;
    public enum Type{
        INTERNE, CLIENT
    }

    @ManyToOne
    public Client client;

    @ManyToMany
    @JoinTable(name="Project_Contact")
    public Set<Contact> contact;

    @ManyToMany
    @JoinTable(name="Project_Profile")
    public Set<Profile> profile;

//    @ManyToMany
//    @JoinTable(name="Collaborator_Project")
//    public Collaborator collaborator;

    public enum Status{
        PENDING, ONGOING, GUARANTEE, MAINTENANCE, DONE
    }
}
