package models;

import play.db.jpa.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Project extends Model {
    public String name;
    public static enum Type{
        INTERNAL, CLIENT

    }
    public Type type;

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

    @OneToMany (mappedBy = "project")
    public Set<WorkingDayActivities> workingDayActivities;


    public enum Status{
        PENDING, ONGOING, GUARANTEE, MAINTENANCE, DONE
    }
    public Status status;
}
