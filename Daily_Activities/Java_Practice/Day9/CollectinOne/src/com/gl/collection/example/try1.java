package com.gl.collection.example;

import java.util.*;
public class try1 
{
    public static void main(String[] args)
    {
        List<Integers> marks = new ArrayList<>();

        marks.add(90);
        marks.add(20);
        marks.add(70);
        marks.add(60);

        //marks.remove(1); // remove element at index 1
        marks.remove(Integer.valueOf(20)); // remove element with value 20
        System.out.println(marks);
    }  
}