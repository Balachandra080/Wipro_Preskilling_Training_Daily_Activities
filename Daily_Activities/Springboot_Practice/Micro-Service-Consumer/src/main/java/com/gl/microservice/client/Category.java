package com.gl.microservice.client;


public class Category {

    private int id;
    private String name;

    // Default constructor
    public Category() {}

    // Parameterized constructor
    public Category(String name) {
        this.name = name;
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
}
