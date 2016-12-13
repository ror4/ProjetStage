package models;


import org.joda.time.DateTime;
import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;




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

    public Date endDate;


    public ArrayList<SalariesHistory> Salaries;

    //@Required
    public float loadFactor;

    //@Required
    public float averageDailyCost;

    //@OneToMany (mappedBy = "Role")
    public ArrayList<Role> Roles;

    //@OneToMany (mappedBy = "Knowledge")
    public ArrayList<Knowledge> knowledges;

    //@Required
    public String password;

    public String token;

    @Temporal(TemporalType.DATE)
    public Date tokenCreatedAt;


}
