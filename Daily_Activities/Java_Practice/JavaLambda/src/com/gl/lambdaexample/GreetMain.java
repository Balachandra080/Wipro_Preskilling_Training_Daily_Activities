package com.gl.lambdaexample;

public class GreetMain 
{
    public static void main(String[] args) 
    {
        PrintGreet greetHello = new PrintGreet("Hello", 10);
        PrintGreet greetHai = new PrintGreet("Hai", 5);

        Thread t1 = new Thread(greetHello);
        Thread t2 = new Thread(greetHai);

        t1.start();
        t2.start();
    }
}