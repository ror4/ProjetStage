package services;

import models.Collaborator;

import java.util.Date;

public interface ISalariesHistoryService {
    public void addSalary(float salary, String comments, Date changeDate, Collaborator collabo);
}
