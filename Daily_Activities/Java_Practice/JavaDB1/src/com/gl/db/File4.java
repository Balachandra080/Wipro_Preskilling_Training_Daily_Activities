package com.gl.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class File4
{
    
    public static void main(String args[])
    {
        //java and mysql server all are runingin same machine -> localhost
        //java and mysql running on different machine -> ip address
        //https://www.google.com -> web server
        //ftp -> file server
        //jdbc:mysql:// -> mysql database server

        //where is the db
        String url = "jdbc:mysql://localhost:3306/learn_fk";

        //what is the username
        String username = "root";

        //what is the password
        String password = "Balachandra@123";
        try
        {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //first step: connecting to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            //prepare the sql query

            String selectsql = "select * from course";
            PreparedStatement ps = connection.prepareStatement(selectsql);

            //execute the query
            ResultSet rs = ps.executeQuery();

            //rs.next() --> goes to row one by one
            while(rs.next())
            {
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Hrs : " + rs.getInt("duration"));
            }

            System.out.println("Course selected succesfully");
            
            ps.close();
            connection.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}