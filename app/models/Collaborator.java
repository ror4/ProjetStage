package models;


import org.joda.time.DateTime;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.util.ArrayList;


@Entity
public class Collaborator extends Model{

    public String firstName;
    public String lastName;
    public String email;
    public Date startDate;
    public Date endDate;
    @ManyToOne
    public long SalariesHistory_Id;
    public float loadFactor;
    public float averageDailyCost;
    public String password;
    @
    public long role_id;
    public ArrayList<Knowledge> knowlegdes;
    public String token;
    public DateTime tokenCreatedAt;


}
