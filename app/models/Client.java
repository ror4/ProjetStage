package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Client extends Model {
    public String corporateName;
    public String address;
    public String postalCode;
    public String city;
    public String country;
    public String telephoneNumber;
    public Contact contact;

}
