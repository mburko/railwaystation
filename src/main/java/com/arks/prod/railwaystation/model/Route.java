package com.arks.prod.railwaystation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String start_point;
    private String destination;
    private int train_id;

    public Route(int id, String start_point, String destination, int train_id) {
        this.id = id;
        this.start_point = start_point;
        this.destination = destination;
        this.train_id = train_id;
    }

    public int getId() {
        return id;
    }

    public String getStart_point() {
        return start_point;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrain_id() {
        return train_id;
    }

}
