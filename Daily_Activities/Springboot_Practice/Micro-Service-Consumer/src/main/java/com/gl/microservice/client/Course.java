package com.gl.microservice.client;

public class Course {

    
    private int id;
    private String name;
    private double fees;
    
    // Default constructor
    public Course() {}

    // Parameterized constructor
    public Course(String name, double fees) {
        this.name = name;
        this.fees = fees;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}
