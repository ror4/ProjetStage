package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Contact extends Model {
    public String firstName;
    public String lastName;
    public String email;
    public String telephoneNumber;
    public String description;
}
