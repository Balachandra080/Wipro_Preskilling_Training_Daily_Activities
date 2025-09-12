package com.gl.wrapper.example;

import java.util.*;

public class Try1 
{
    public static void main(String args[])
    {
        List<Integer> marks = new ArrayList<>();

        marks.add(100);
        marks.add(90);
        marks.add(80);

        int total = 0;
        for(int temp: marks)
        {
            total += temp;
        }

        System.out.println("Total marks" + total);
        System.out.println("Average marks" + (total/marks.size()));
    }
}
