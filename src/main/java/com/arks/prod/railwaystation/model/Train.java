package com.arks.prod.railwaystation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int route_id;
    private int platform_id;
    private double dep_date;
    private double arrive_date;

    public Train(int id, int route_id, int platform_id, double dep_date, double arrive_date) {
        this.id = id;
        this.route_id = route_id;
        this.platform_id = platform_id;
        this.dep_date = dep_date;
        this.arrive_date = arrive_date;
    }

    public int getId() {
        return id;
    }

    public int getRoute_id() {
        return route_id;
    }

    public int getPlatform_id() {
        return platform_id;
    }

    public double getDep_date() {
        return dep_date;
    }

    public double getArrive_date() {
        return arrive_date;
    }

}
