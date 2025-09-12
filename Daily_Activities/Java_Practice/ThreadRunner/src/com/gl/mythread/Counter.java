package com.gl.mythread;

public class Counter implements Runnable  // ✅ implements Runnable added
{
    String name;
    int max;

    Counter(String name, int max)
    {
        this.name = name;
        this.max = max;
    }

    public void run()
    {
        int count = 1;
        while (count <= this.max)
        {
            System.out.println("Count is " + count + " (" + name + ")");
            count++;
        }
    }
}
