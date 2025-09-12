package com.gl.spring;

public class Counter {
    int age = 0;

    public void addAge() {
    	System.out.println("Iam adding my age");
        age++;
    }

    public void lessAge() {
        age--;
    }

    public void printAge() {
        System.out.println("Age : " + age);
    }

    public int getAge() {
        return age;
    }
}
