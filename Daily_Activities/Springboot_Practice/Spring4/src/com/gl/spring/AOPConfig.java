package com.gl.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class AOPConfig {

    @Before("execution(public * com.gl.spring.Counter.addAge(..))")
    public void logBeforeAddAge() {
        System.out.println("Add age is about to be called");
    }
    
    @After("execution(public * com.gl.spring.Counter.addAge(..))")
    public void logAfterAddAge() {
        System.out.println("Add age is called");
    }
}
