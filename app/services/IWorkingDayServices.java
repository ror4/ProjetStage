package services;

import models.Collaborator;
import models.WorkingDay;

import java.util.Date;
import java.util.List;

/**
 * Created by Formation on 13/12/2016.
 */
public interface IWorkingDayServices {
    public void createWorkingDay(Collaborator collaborator, Date dayDate, String morningActivity1, String morningActivity2, String afternoonActivity1, String afternoonActivity2);

    public void deleteWorkingDay(Long id);

    public WorkingDay modifWorkingDay(WorkingDay workingDay);

    public List<WorkingDay> getAllWorkingDay();

    public WorkingDay getWorkingDayById(Long id);


}
