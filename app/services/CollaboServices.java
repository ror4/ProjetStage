package services;

import controllers.KnowledgesController;
import models.Collaborator;
import models.Knowledge;
import models.Knowledge_Collaborator;
import models.Role;

import java.util.*;

/**
 * Created by Formation on 12/12/2016.
 */
public class CollaboServices implements ICollaboServices{

    @Override
    public void createCollabo(String firstName, String lastName, String user_email,Date startDate,
                              Date endDate, Integer level, String role ) {
        Collaborator collaborator = new Collaborator();
        collaborator.firstName=firstName.trim();
        collaborator.lastName=lastName.trim();
        collaborator.email=user_email.trim();
        collaborator.startDate=startDate;
        collaborator.endDate=endDate;
        collaborator.save();
        addKnowledgeToCollabo(level,collaborator);
        addRoleToCollabo(role ,collaborator);
    }

    @Override
    public void addKnowledgeToCollabo(Integer level, Collaborator collabo) {
        Knowledge_Collaborator know = new Knowledge_Collaborator();
        Knowledge knowledge = KnowledgesController.getKnowledgeByName("anglais");
        know.knowledge=knowledge;
        know.level=level;
        know.collaborator=collabo;
        know.save();
    }
    @Override
    public void addRoleToCollabo(String roleName, Collaborator collabo){
        Role role = new Role();
        role.roleName = roleName;
        role.collaborator = collabo;
        role.save();
    }

    @Override
    public void deleteCollabo(Long id) {

    }

    @Override
    public Collaborator modifCollabo(Collaborator collabo) {
        return null;
    }

    @Override
    public List<Collaborator> getAllCollabo() {
        List<Collaborator> listeCollabo= new ArrayList();
        listeCollabo=Collaborator.findAll();
        return listeCollabo;
    }

    @Override
    public Collaborator getCollaboById(Long id) {
        return null;
    }
}
