package controllers;


import models.Collaborator;
import models.SalariesHistory;
import play.mvc.Controller;

import java.util.*;

import static controllers.CollaborateurController.collabo;

public class SalariesHistoryController extends Controller {
    public static void addSalary(Long id){
        Collaborator collaborator = Collaborator.findById(id);
        render(collaborator);}

    public static void showSalary(Long id){
        Collaborator collaborator = Collaborator.findById(id);
        Set<SalariesHistory> salariesHistory = collaborator.salariesHistories;
        render(salariesHistory,collaborator);}

    public static void save(SalariesHistory salariesHistory, Long id){
        Collaborator collaborator = Collaborator.findById(id);
        salariesHistory.collaborator = collaborator;
        salariesHistory.save();
        collabo();
    }
}
