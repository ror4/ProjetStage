package services;

import models.Collaborator;
import models.Knowledge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Formation on 12/12/2016.
 */
public class CollaboServices implements ICollaboServices{

    @Override
    public void createCollabo(Collaborator collabo) {
        collabo.save();
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
