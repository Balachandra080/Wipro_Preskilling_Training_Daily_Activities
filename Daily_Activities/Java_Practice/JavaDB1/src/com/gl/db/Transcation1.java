package com.gl.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transcation1 
{
    public static void main(String args[])
    {
        //where is the db
        String url = "jdbc:mysql://localhost:3306/learn_fk";

        //what is the username
        String username = "root";

        //what is the password
        String password = "Balachandra@123";
        Connection connection = null;
        try
        {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            //very important to start a transaction logic
            connection.setAutoCommit(false);

            //prepare the sql query
            String insertSql = "insert into course values (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(insertSql);

            //supply the values for the query
            ps.setInt(1,11);
            ps.setString(2,"course1");
            ps.setInt(3,3);
            ps.execute();
            System.err.println("Course 1 inserted");

            ps.setInt(1,12);
            ps.setString(2,"course2");
            ps.setInt(3,3);
            ps.execute();
            System.err.println("Course 2 inserted");

            ps.setInt(1,13);
            ps.setString(2,"course3");
            ps.setInt(3,3);//run time exception in sql
            ps.execute();
            System.err.println("Course 3 inserted");

            ps.setInt(1,14);
            ps.setString(2,"course4");
            ps.setInt(3,3);
            ps.execute();
            System.err.println("Course 4 inserted");

            ps.setInt(1,15);
            ps.setString(2,"course5");
            ps.setInt(3,3);
            ps.execute();
            System.err.println("Course 5 inserted");
            
            connection.commit();
            System.out.println("Course added successfully");
            ps.close();
            connection.close();
    
        }
        catch(Exception e)
        {
            try
            {
                if(connection != null)
                {
                    System.out.println("rollback happening");
                    connection.rollback();
                }
                e.printStackTrace();
            }
            catch(SQLException ex)
            {
                System.out.println("Rollback failed");
            }
        }
    }
}