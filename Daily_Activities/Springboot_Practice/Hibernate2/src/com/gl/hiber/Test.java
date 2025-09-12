package com.gl.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {

        try {
            // Load Hibernate configuration
            SessionFactory factory = new Configuration().configure().buildSessionFactory();

            // Open a session
            Session session = factory.openSession();

            // Start a transaction
            Transaction tx = session.beginTransaction();
            
            /*
            Teacher t1 = new Teacher("Harini",30);
            Aadhar a1 = new Aadhar("A0003",t1);
           
            session.save(t1); // save the teacher
            session.save(a1); // save thae aadhar
            */
            Teacher t1 = session.get(Teacher.class,1);
            System.out.println("Teacher Name : " + t1.getName());
            System.out.println("Aadhar number : "+ t1.getAadhar().getAadharNumber());
            
            Aadhar a1 = session.get(Aadhar.class, 1);
            System.out.println("Aadhar number : "+a1.getAadharNumber());
            System.out.println("Teacher Name : "+a1.getTeacher().getName());
            
            // Commit transaction
            tx.commit();

            session.close();


        } catch (Exception ex) {
            System.out.println("❌ Error in one-to-one mapping: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
