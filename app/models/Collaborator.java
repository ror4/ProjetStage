package models;


import org.joda.time.DateTime;
import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
public class Collaborator extends Model{

    @Required
    public String firstName;

    //@Required
    public String lastName;

    //@Required
    @Email


    public String email;

    //@Required
    @Temporal(TemporalType.DATE)
    public Date startDate;

    @Temporal(TemporalType.DATE)
    public Date endDate;

    @OneToMany (mappedBy = "collaborator")
    public Set<SalariesHistory> salariesHistories;

    //@Required
    public float loadFactor;

    //@Required
    public float averageDailyCost;

    @OneToMany (mappedBy = "collaborator")
    public Set<Role> roles;

    @OneToMany (mappedBy = "collaborator")
    public Set<Knowledge> knowledges;

    @OneToMany(mappedBy = "collaborator")
    public Set<WorkingDay> workingDays;

    //@Required
    public String password;

    public String token;

    @Temporal(TemporalType.DATE)
    public Date tokenCreatedAt;

    @ManyToMany
    @JoinTable (name = "Collaborator_Project")
    public List<Project> projects;


}
