package services;

import models.Project;

import java.util.ArrayList;
import java.util.List;


public class ProjectServices implements IProjectServices{
    @Override
    public void createProject(String projectName, Project.Type type) {
        Project project = new Project();
        project.name = projectName.trim();
        project.type = type;
        project.save();
    }


    @Override
    public void deleteProject(Long id) {
    }

    @Override
    public Project modifCollabo(Project project) {
        return null;
    }

    @Override
    public List<Project> getAllProject() {
        List<Project> ProjectsList= new ArrayList();
        ProjectsList=Project.findAll();
        return ProjectsList;
    }

    @Override
    public Project getProjectById(Long id) {
        return null;
    }
}
