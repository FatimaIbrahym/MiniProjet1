package com.company.models;

import java.util.List;

public class Module {

    private Long id;
    private String name;
    private double moy;

    public Module(Long id, String name, double moy) {
        this.id = id;
        this.name = name;
        this.moy = moy;
    }

    public Module(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoy() {
        return moy;
    }

    public void setMoy(double moy) {
        this.moy = moy;
    }
}
