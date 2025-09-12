package com.gl.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
import java.util.ArrayList;

public class TestMM {

    public static void main(String[] args) {

        try {
            // Load Hibernate configuration
            SessionFactory factory = new Configuration().configure().buildSessionFactory();

            // Open a session
            Session session = factory.openSession();

            // Start a transaction
            Transaction tx = session.beginTransaction();
            
            Member m1 = new Member("M1");
            Member m2 = new Member("M2");
            Member m3 = new Member("M3");
            Member m4 = new Member("M4");
            Member m5 = new Member("M5");
            Member m6 = new Member("M6");

            Project p1 = new Project("P1");
            Project p2 = new Project("P2");
            Project p3 = new Project("P3");

            // p1 -> m1, m2, m3
            List<Member> set1 = new ArrayList<>();
            set1.add(m1);
            set1.add(m2);
            set1.add(m3);

            // p2 -> m4, m5
            List<Member> set2 = new ArrayList<>();
            set2.add(m4);
            set2.add(m5);

            // p3 -> m6, m1, m4
            List<Member> set3 = new ArrayList<>();
            set3.add(m6);
            set3.add(m1);
            set3.add(m4);
            
            // mapping by projects with the group by members
            p1.setMembers(set1);
            p2.setMembers(set2);
            p3.setMembers(set3);

            session.save(m1);
            session.save(m2);
            session.save(m3);
            session.save(m4);
            session.save(m5);
            session.save(m6);
            
            session.save(p1);
            session.save(p2);
            session.save(p3);
            
            // Commit transaction
            tx.commit();

            session.close();


        } catch (Exception ex) {
            System.out.println("❌ Error in many-to-many mapping: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
