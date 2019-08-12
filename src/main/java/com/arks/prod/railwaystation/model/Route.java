package com.arks.prod.railwaystation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String start_point;
    private String destination;
    private long train_id;
    private int distance;

    public Route(long id, String start_point, String destination, long train_id, int distance) {
        this.id = id;
        this.start_point = start_point;
        this.destination = destination;
        this.train_id = train_id;
        this.distance = distance;
    }

    public long getId() {
        return id;
    }

    public String getStart_point() {
        return start_point;
    }

    public String getDestination() {
        return destination;
    }

    public long getTrain_id() {
        return train_id;
    }

    public int getDistance() {
        return distance;
    }
}