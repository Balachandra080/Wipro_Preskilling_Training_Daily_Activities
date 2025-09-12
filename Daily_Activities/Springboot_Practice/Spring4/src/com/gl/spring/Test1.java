package com.gl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String args[]) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext("AppContext.xml");

        Counter bean1 = context1.getBean("counter1", Counter.class);

        bean1.addAge();
        
        //bean1.lessAge();
        //bean1.addAge();
        //bean1.printAge();
        //bean1.addAge();
        //System.out.println(bean1.getAge());
    }
}
