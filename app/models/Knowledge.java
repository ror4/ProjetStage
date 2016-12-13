package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Knowledge extends Model {
    public String name;

//    @OneToMany(mappedBy = "knowledge")
//    public Set<Knowledge_Collaborator> knowledge_collaborators;

}
