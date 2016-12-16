package services;

import controllers.KnowledgesController;
import models.SalariesHistory;
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
                              Date endDate, String knowledges, String role, float salary, String comments, Date changeDate) {
        Collaborator collaborator = new Collaborator();
        collaborator.firstName=firstName.trim();
        collaborator.lastName=lastName.trim();
        collaborator.email=user_email.trim();
        collaborator.startDate=startDate;
        collaborator.endDate=endDate;
        collaborator.save();
        addKnowledgeToCollabo(knowledges,collaborator);
        addRoleToCollabo(role ,collaborator);
//        addKnowledgeToCollabo(knowledges,collaborator);
        addSalaryToCollaborator(salary,comments, collaborator, changeDate);
    }

    @Override
    public void addKnowledgeToCollabo(String knowledges, Collaborator collabo) {
        if(!knowledges.equals("")){
            String[] parts = knowledges.split("-");
            Integer taille = parts.length;
            for (int i=0;i<taille;i++) {
                Knowledge knowledge = new Knowledge();
                Knowledge_Collaborator know = new Knowledge_Collaborator();
                String[] parts2 = parts[i].split(",");
                Long id = Long.parseLong(parts2[0]);
                knowledge = Knowledge.findById(id);
                know.knowledge = knowledge;
                know.level = Integer.parseInt(parts2[1]);
                know.collaborator = collabo;
                know.save();
            }
        }
    }

    @Override
    public void addSalaryToCollaborator(float salary, String comments, Collaborator collaborator, Date changeDate) {
        SalariesHistory salariesHistory = new SalariesHistory();
        salariesHistory.salary = salary;
        salariesHistory.collaborator = collaborator;
        salariesHistory.comments = comments;
        salariesHistory.changeDate = changeDate;
        salariesHistory.save();
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
