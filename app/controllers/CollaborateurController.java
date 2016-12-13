package controllers;

import models.Collaborator;
import play.mvc.Controller;
import services.CollaboServices;
import services.ICollaboServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Formation on 13/12/2016.
 */
public class CollaborateurController extends Controller{

    public static void collabo (){
        List<Collaborator> listeCollabo = new ArrayList();
        ICollaboServices var = new CollaboServices();
        listeCollabo = var.getAllCollabo();
        renderTemplate("/collaborateurs.html",listeCollabo);
    }

    public static void formCollabo (){
        renderTemplate("/formulaireCollaborateur.html");
    }

    public void createCollaborator (String prenom){
        Collaborator collaborator = new Collaborator();
        collaborator.firstName=prenom;
        ICollaboServices var = new CollaboServices();
        var.createCollabo(collaborator);
        collabo();
    }
}
