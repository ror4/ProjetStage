package services;

import models.Collaborator;

import java.util.Date;
import java.util.List;

/**
 * Created by Formation on 12/12/2016.
 */
public interface ICollaboServices {

    public void createCollabo(String firstName, String lastName, String user_email,Date startDate,
                              Date endDate, Integer ang);

    public void addKnowledgeToCollabo(Integer ang, Collaborator collabo);

    public void deleteCollabo(Long id);

    public Collaborator modifCollabo(Collaborator collabo);

    public List<Collaborator> getAllCollabo();

    public Collaborator getCollaboById(Long id);
}
