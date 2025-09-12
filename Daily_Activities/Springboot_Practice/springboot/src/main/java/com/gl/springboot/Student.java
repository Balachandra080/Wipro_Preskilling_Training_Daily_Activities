package com.gl.springboot;

import lombok.Data;

@Data
public class Student {
    private String name;
    private int age;
    private double weight;

    public Student() {}

    public Student(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
