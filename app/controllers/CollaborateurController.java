package controllers;

import models.Collaborator;
import models.Knowledge;
import play.mvc.Controller;
import services.CollaboServices;
import services.ICollaboServices;
import services.IKnowledgesServices;
import services.KnowledgesServices;

import java.util.*;

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
        List<Knowledge> listKnowledges = Knowledge.findAll();
        renderTemplate("/formulaireCollaborateur.html",listKnowledges);
    }

    public void createCollaborator (String firstName, String lastName, String user_email,Date startDate,
                                    Date endDate, String knowledges, String role){
        ICollaboServices var2 = new CollaboServices();
        var2.createCollabo(firstName, lastName, user_email, startDate, endDate, knowledges, role);
        collabo();
    }
}
