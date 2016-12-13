package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Formation on 13/12/2016.
 */
@Entity
public class Knowledge_Collaborator extends Model {

    public int level;
    @ManyToOne
    public Knowledge knowledge;
    @ManyToOne
    public Collaborator collaborator;
}
