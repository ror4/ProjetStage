package services;

import models.Collaborator;
import models.SalariesHistory;

import java.util.Date;

public class SalariesHistoryService implements ISalariesHistoryService{

    @Override
    public void addSalary(float salary, String comments, Date changeDate, Collaborator collaborator){
        SalariesHistory salariesHistory = new SalariesHistory();
        salariesHistory.collaborator = collaborator;
        salariesHistory.comments = comments;
        salariesHistory.salary = salary;
        salariesHistory.changeDate = changeDate;
        salariesHistory.save();
    }
}
