package com.gl.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class File2
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
            String updateSql = "UPDATE course SET duration = ?, name = ? WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(updateSql);

            //supply the values for the query
            ps.setInt(1, 3);
            ps.setString(2,"CSS3");
            ps.setInt(3, 3);

            //execute the query
            ps.execute();

            System.out.println("Course updated successfully");

            ps.close();
            connection.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
