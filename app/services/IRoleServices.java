package services;

import models.Collaborator;
import models.Role;

import java.util.List;

/**
 * Created by Formation on 13/12/2016.
 */
public interface IRoleServices {

    public void createRole(String roleName );
    public void deleteRole(Long id);

    public Collaborator modifRole(Role role);

    public List<Role> getAllRole();

    public Role getRoleById(Long id);
}
