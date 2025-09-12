package com.gl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("******* Context 1 *********");

        // Load the Spring configuration file
        ApplicationContext context1 = new ClassPathXmlApplicationContext("AppContext.xml");

        // ---- C1 ----
        System.out.println("---- C1 ----");
        // Asking Spring for bean named "myCounter"
        Counter c1 = context1.getBean("myCounter", Counter.class);
        c1.increaseCount();
        c1.increaseCount();

        // ---- C2 ----
        System.out.println("---- C2 ----");
        // Asking Spring for bean named "myBall"
        Counter c2 = context1.getBean("myBall", Counter.class);
        c2.increaseCount();
        c2.increaseCount();
    }
}
