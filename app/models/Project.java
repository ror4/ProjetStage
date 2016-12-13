package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Project extends Model {
    public String name;
    public enum Type{
        INTERNAL, CLIENT
    }

    @ManyToOne
    public Client client;

    @ManyToMany
    @JoinTable(name="Project_Contact")
    public List<Contact> contacts;

    @ManyToMany
    @JoinTable(name="Project_Profile")
    public List<Profile> profiles;

    @ManyToMany
    @JoinTable(name="Collaborator_Project")
    public List<Collaborator> collaborators;

    public enum Status{
        PENDING, ONGOING, GUARANTEE, MAINTENANCE, DONE
    }
}
