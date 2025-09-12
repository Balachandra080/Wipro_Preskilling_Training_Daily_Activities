package com.gl.mythread;

public class Launch 
{
    public static void main(String[] args) 
    {
        Thread rockThread = new Thread(new Counter("Rocket", 10));
        Thread shipThread = new Thread(new Counter("Ship", 5));

        rockThread.start();
        shipThread.start();
    }
}