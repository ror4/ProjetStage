package services;

import models.Collaborator;
import models.WorkingDay;

import java.util.Date;
import java.util.List;

/**
 * Created by Formation on 14/12/2016.
 */
public class WorkingDayServices implements IWorkingDayServices {


    @Override
    public void createWorkingDay(Collaborator collaborator, Date dayDate, String morningActivity1, String morningActivity2, String afternoonActivity1, String afternoonActivity2) {

    }

    @Override
    public void deleteWorkingDay(Long id) {

    }

    @Override
    public WorkingDay modifWorkingDay(WorkingDay workingDay) {
        return null;
    }

    @Override
    public List<WorkingDay> getAllWorkingDay() {
        return null;
    }


    @Override
    public WorkingDay getWorkingDayById(Long id) {
        return null;
    }


}
