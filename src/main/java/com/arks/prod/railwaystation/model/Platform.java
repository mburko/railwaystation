package com.arks.prod.railwaystation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long train_id;

    public Platform(long id, String name, long train_id) {
        this.id = id;
        this.name = name;
        this.train_id = train_id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getTrain_id() {
        return train_id;
    }
}