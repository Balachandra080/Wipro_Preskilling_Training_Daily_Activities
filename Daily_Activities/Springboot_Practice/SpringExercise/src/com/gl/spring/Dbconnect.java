package com.gl.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Dbconnect {

    public static void main(String args[]) {

        try {
            String url = "jdbc:mysql://localhost:3306/wipro_2025_java_web";
            String username = "root";
            String password = "Balachandra@123";

            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
            dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            JdbcTemplate template = new JdbcTemplate(dataSource);

            // ---------------- INSERT ----------------
            String insert = "INSERT INTO book (name, author, price) VALUES ('Garuda Puranam','yama',500)";
            template.execute(insert);

        } catch (Exception ex) {
            System.out.println("❌ Error in db spring : " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
