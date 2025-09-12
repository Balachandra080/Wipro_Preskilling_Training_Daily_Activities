package com.gl.lambdaexample;

public class Square<T> 
{
    private T side;

    void setSide(T side)
    {
        this.side = side;
    }

    T getSide()
    {
        return this.side;
    }
}