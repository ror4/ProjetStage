package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Collaborator extends Model{

    public String firstName;
    public String lastName;
}
