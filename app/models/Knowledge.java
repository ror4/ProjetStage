package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Knowledge extends Model {
    public String name;
    public int level;

    @ManyToOne
    public Collaborator collaborator;
}
