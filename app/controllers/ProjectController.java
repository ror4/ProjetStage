package controllers;


import models.Client;
import models.Project;

import services.ProjectServices;
import services.IProjectServices;

import java.util.ArrayList;
import java.util.List;

import play.mvc.Controller;



public class ProjectController extends Controller {
    public static void projects() {

        List<Project> ProjectsList = new ArrayList();
        IProjectServices var = new ProjectServices();
        ProjectsList = var.getAllProject();
        renderTemplate("/Projects/projects.html", ProjectsList);
    }

    public static void formulaireProject (){

        renderTemplate("/Projects/formulaireProjet.html");
    }

    public void createProject(String projectName, Project.Type projectType){

        List<Client> listClient = new ArrayList();
        IClientService var = new ClientServices();
        listClient = var.getAllProject();

        IProjectServices var2 =  new ProjectServices();
        var2.createProject(projectName, projectType);
        projects();
    }
}

