package com.gl.error;
public class Sample1 
{ 
    public void divide(int a , int b)
    {
        try
        {
            System.out.println("Q" + (a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't div by Zero");
        }
    }
    public void divide2(int a, int b) throws ArithmeticException
    {
        System.out.println("Q" + (a/b));
    }
    public void divide3(int a, int b)
    {
        if(b == 0)
        {
            throw new ArithmeticException("It will not divided by Zero");
        }
        System.out.println("Q" + (a/b));
    }
    public static void main(String[] args) 
    {
        Sample1 s1 = new Sample1();
        try
        {
            s1.divide3(25, 0);
        }
        catch(ArithmeticException ex)
        { 
            System.out.println("Divide by 0 ");
        }
    }
}