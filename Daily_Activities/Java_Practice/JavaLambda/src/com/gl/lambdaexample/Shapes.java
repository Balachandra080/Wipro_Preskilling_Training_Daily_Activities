package com.gl.lambdaexample;

public class Shapes 
{
    public static void main(String[] args) 
    {
        Square<Integer> s1 = new Square<>();  // usual method
        s1.setSide(10);

        Square<Double> s2 = new Square<>();
        s2.setSide(24.56);
    }
}
