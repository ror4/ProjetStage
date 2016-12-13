package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Profile extends Model{
    public String name;
    public float dailyRate;
    public float daysSold;
}
