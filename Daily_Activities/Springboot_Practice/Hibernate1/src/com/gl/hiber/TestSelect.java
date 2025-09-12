package com.gl.hiber;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSelect {

    public static void main(String args[]) {
        try {
            // Loading the hibernate configuration
            SessionFactory factory = new Configuration().configure().buildSessionFactory();

            // Connect using the above configuration
            Session session = factory.openSession();

            // Open a transaction
            Transaction tx = session.beginTransaction();

            // Fetch by ID (like: select * from mobile where id = 2)
            Mobile m1 = session.get(Mobile.class, 2);
            System.out.println("Mobile company : " + m1.getCompany());

            // Fetch all rows (like: select * from mobile)
            List<Mobile> mobiles = session.createQuery("from Mobile", Mobile.class).list();
            for (Mobile temp : mobiles) {
                System.out.println("Name : " + temp.getCompany());
            }

            // Close the transaction
            tx.commit();

            // Close the session
            session.close();

        } catch (Exception ex) {
            System.out.println("Error in hiber : " + ex.getMessage());
        }
    }
}
