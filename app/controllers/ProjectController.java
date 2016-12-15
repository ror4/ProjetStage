package controllers;


import models.Client;
import models.Profile;
import models.Project;

import services.*;

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
        List<Client> clientList = new ArrayList();
        IClientServices var4 = new ClientServices();
        clientList = var4.getAllClient();

        List<Profile> profilList = new ArrayList();
        IProfileServices var3 = new ProfileServices();
        profilList = var3.getAllProfile();

        renderTemplate("/Projects/formulaireProjet.html", clientList, profilList);
    }

    public void createProject(Project project){

        project.save();


    }
}

