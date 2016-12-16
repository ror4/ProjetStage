package services;

import models.Collaborator;

import java.util.Date;
import java.util.List;

/**
 * Created by Formation on 12/12/2016.
 */
public interface ICollaboServices {

    public void createCollabo(String firstName, String lastName, String user_email,Date startDate,
                              Date endDate, String knowledges, String Role, float salary, String comments, Date changeDate);

    public void addKnowledgeToCollabo(String knowledges, Collaborator collabo);
    public void addSalaryToCollaborator(float salary, String comments, Collaborator collaborator, Date changeDate);
    public void addRoleToCollabo(String role, Collaborator collabo);
    public void deleteCollabo(Long id);

    public Collaborator modifCollabo(Collaborator collabo);

    public List<Collaborator> getAllCollabo();

    public Collaborator getCollaboById(Long id);
}
