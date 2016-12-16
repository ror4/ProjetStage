package controllers;

import models.Collaborator;
import models.Knowledge;
import play.mvc.Controller;
import services.CollaboServices;
import services.ICollaboServices;
import services.IKnowledgesServices;
import services.KnowledgesServices;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Formation on 13/12/2016.
 */
public class KnowledgesController extends Controller{

    public void addKnowledge(String name) {
        IKnowledgesServices var = new KnowledgesServices();
        var.addKnowledge(name);
        CollaborateurController.formConnaissance ();
    }

    public static Knowledge getKnowledgeByName(String name) {
        IKnowledgesServices var = new KnowledgesServices();
        return var.getKnowledgeByName(name);
    }

    public static void getAllKnowledgeJson() {
        IKnowledgesServices var = new KnowledgesServices();
        List<Knowledge> listeKnowledge = var.getAllKnowledgeJson();
        renderJSON(listeKnowledge);
    }

}
