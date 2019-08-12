package com.arks.prod.railwaystation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int number;
    private String grade;
    private double dep_date;
    private double arrive_date;

    public Train(long id, int number, String grade, double dep_date, double arrive_date) {
        this.id = id;
        this.number = number;
        this.grade = grade;
        this.dep_date = dep_date;
        this.arrive_date = arrive_date;
    }

    public long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getGrade() {
        return grade;
    }

    public double getDep_date() {
        return dep_date;
    }

    public double getArrive_date() {
        return arrive_date;
    }
}