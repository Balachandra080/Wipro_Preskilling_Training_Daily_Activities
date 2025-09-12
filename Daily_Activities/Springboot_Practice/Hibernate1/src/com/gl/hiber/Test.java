package com.gl.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String args[]) {

        try {
            // Loading the hibernate configuration
            SessionFactory factory = new Configuration().configure().buildSessionFactory();

            // Connect using the above configuration
            Session session = factory.openSession();

            // Open a transaction
            Transaction tx = session.beginTransaction();

            // SQL Action
            
            // insert a mobile 
            //Mobile m1 = new Mobile("Samsung", "M001", 10000.00, 4, "White");
            //session.save(m1); // Hibernate will write the insert query - to store it in the DB
            
            //session.save(new Mobile("Vivo", "M002", 10000, 3, "Orange"));
            
            Mobile m2 = new Mobile(1, "Vivo", "M002", 15000, 3, "Orange");
            session.update(m2);

            
            
            // Commit transaction
            tx.commit();

            // Close session
            session.close();

        } catch (Exception ex) {
            System.out.println("Error in Hibernate: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
