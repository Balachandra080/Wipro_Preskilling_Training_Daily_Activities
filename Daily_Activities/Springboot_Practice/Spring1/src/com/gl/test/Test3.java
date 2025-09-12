package com.gl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("******* Context 1 *********");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("AppContext.xml");

        System.out.println("---- C1 ----");
        Counter c1 = context1.getBean("myTicket", Counter.class);
        c1.increaseCount();
        c1.increaseCount();

        System.out.println("---- C2 ----");
        Counter c2 = context1.getBean("myTicket", Counter.class);
        c2.increaseCount();
        c2.increaseCount();
    }
}
