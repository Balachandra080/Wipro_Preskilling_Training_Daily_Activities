package com.gl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main(String[] args) 
    {
        // Load Spring configuration file
        ApplicationContext context1 = new ClassPathXmlApplicationContext("AppContext.xml");

        System.out.println("---- C1 ----");
        // Fetch bean "myCounter" from context
        Counter c1 = context1.getBean("myCounter", Counter.class);
        c1.increaseCount();
        c1.increaseCount();

        System.out.println("---- C2 ----");
        // Fetch bean "myCounter" again
        Counter c2 = context1.getBean("myCounter", Counter.class);
        c2.increaseCount();
        c2.increaseCount();
        
        
        System.out.println("******* context2 *******");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("AppContext.xml"); 
        System.out.println("-----C3----");
        Counter c3 = context2.getBean("myCounter", Counter.class);
        c3.increaseCount();
        c3.increaseCount();
        
        System.out.println("---- C4 ----");
        // Fetch bean "myCounter" again
        Counter c4 = context2.getBean("myCounter", Counter.class);
        c4.increaseCount();
        c4.increaseCount();
        
        
    }
}
