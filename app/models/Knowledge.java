package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Knowledge extends Model {
    public String name;
    public String level;
    public long Collaborator_id;
}
