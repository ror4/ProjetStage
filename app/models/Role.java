package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Role extends Model {

    public String roleName;

    @ManyToOne
    public Collaborator collaborator;
}
