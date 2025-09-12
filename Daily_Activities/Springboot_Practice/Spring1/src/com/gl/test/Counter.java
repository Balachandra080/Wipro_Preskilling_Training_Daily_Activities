package com.gl.test;

public class Counter {
    private int count = 0;

    public void increaseCount() {
        count++;
        System.out.println("Counter : " + count); // ✅ Corrected
    }
}
