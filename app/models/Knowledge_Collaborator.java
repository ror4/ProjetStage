package models;

import play.db.jpa.Model;

/**
 * Created by Formation on 13/12/2016.
 */
public class Knowledge_Collaborator extends Model {

    public long Collaborator_id;
    public long Knowledge_id;
    public int niveau;
}
