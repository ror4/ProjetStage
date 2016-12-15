package services;

import models.Profile;

import java.util.List;

/**
 * Created by Formation on 15/12/2016.
 */
public interface IProfileServices {

    public void createProfile(String profileName, float dailyRate );
    public void deleteProfile(Long id);

    public Profile modifProfile(Profile profile);

    public List<Profile> getAllProfile();

    public Profile getProfileById(Long id);
}
