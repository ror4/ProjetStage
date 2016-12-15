package services;

import models.Project;

import java.util.List;

/**
 * Created by Formation on 14/12/2016.
 */
public interface IProjectServices {

    public void createProject(String projectName, Project.Type type);

    public void deleteProject(Long id);

    public Project modifCollabo(Project project);

    public List<Project> getAllProject();

    public Project getProjectById(Long id);
}
