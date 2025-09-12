package com.gl.collection.example;

import java.util.*;
public class Hashset1 
{
    public static void main(String[] args)
    {
        HashSet<String> names = new HashSet<>();

        names.add("Jack");
        names.add("Jack");
        names.add("King");
        names.add("Queen");
        names.add("null");
        names.add("null");
        names.add("queen");

        System.out.println(names);

        names.remove("Jack");
        System.out.println("King exits or not" + names.contains("King"));

        System.out.println(names.size());

        names.clear();
    }
}
