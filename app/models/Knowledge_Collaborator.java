package models;

import javax.persistence.ManyToOne;

/**
 * Created by Formation on 13/12/2016.
 */
public class Knowledge_Collaborator {
    public int level;
    @ManyToOne
    public Knowledge knowledge;
    @ManyToOne
    public Collaborator collaborator;
}
