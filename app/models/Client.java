package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Client extends Model {
    public String corporateName;
    public String address;
    public String postalCode;
    public String city;
    public String country;
    public String telephoneNumber;
    public Contact contact;

    @OneToMany (mappedBy = "client")
    public Set<Project> projects;

}
