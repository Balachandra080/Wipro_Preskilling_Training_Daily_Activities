package com.gl.microservice.client;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double fees;
    
    @ManyToOne
    @JoinColumn(name = "category_id")  // foreign key in Course table
    private Category category;

    // Default constructor
    public Course() {}

    // Parameterized constructor
    public Course(String name, double fees, Category category) {
        this.name = name;
        this.fees = fees;
        this.category = category;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
