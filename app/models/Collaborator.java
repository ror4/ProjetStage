package models;


import models.Knowledge_Collaborator;
import org.joda.time.DateTime;
import play.db.jpa.Model;

import javax.persistence.Entity;
import java.sql.Date;
import java.util.ArrayList;


@Entity
public class Collaborator extends Model{

    public String firstName;
    public String lastName;
    public String email;
    public Date startDate;
    public float salary;
    public float loadFactor;
    public float averageDailyCost;
    public String password;
    public long role_id;
    public ArrayList<Knowledge_Collaborator> knowlegdes;
    public String token;
    public DateTime tokenCreatedAt;


}
