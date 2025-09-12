package com.gl.lambdaexample;

public class PrintGreet extends Thread 
{
    private String message;
    private int count;

    public PrintGreet(String message, int count) 
    {
        this.message = message;
        this.count = count;
    }

    public void run() 
    {
        for (int i = 1; i <= count; i++) 
        {
            System.out.println(message + " (" + i + ")");
            try 
            {
                Thread.sleep(100); 
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread interrupted: " + message);
            }
        }
    }
}
