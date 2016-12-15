package services;

import models.Profile;
import models.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Formation on 15/12/2016.
 */
public class ProfileServices implements IProfileServices{

    @Override
    public void createProfile(String profileName, float dailyRate ) {
        Profile profile = new Profile();
        profile.name = profileName.trim();
        profile.dailyRate = dailyRate;
        profile.save();
    }

    @Override
    public void deleteProfile(Long id) {

    }

    @Override
    public Profile modifProfile(Profile profile) {
        return null;
    }

    @Override
    public List<Profile> getAllProfile() {

        List<Profile> profileList= new ArrayList();
        profileList=Profile.findAll();
        return profileList;
    }

    @Override
    public Profile getProfileById(Long id) {
    return null;
    }
}
