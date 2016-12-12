package services;

import models.Collaborator;

import java.util.List;

/**
 * Created by Formation on 12/12/2016.
 */
public interface ICollaboServices {

    public void createCollabo(Collaborator collabo);

    public void deleteCollabo(Long id);

    public Collaborator modifCollabo(Collaborator collabo);

    public List<Collaborator> getAllCollabo();

    public Collaborator getCollaboById(Long id);
}
