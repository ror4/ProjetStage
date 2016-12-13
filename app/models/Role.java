package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Role extends Model {
    @ManyToOne
    public Collaborator collaborator;
}
