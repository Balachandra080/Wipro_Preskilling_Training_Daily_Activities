package com.gl.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class DbConnect {

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

            // ---------------- INSERT 1 (direct SQL) ----------------
            String insert = "insert into product (name,price,discount,unit) values ('watermelon',100,10,3)";
            //template.execute(insert);

            // ---------------- INSERT 2 (with parameters) ----------------
            String insert2 = "insert into product (name, price, discount, unit) values (?, ?, ?, ?)";
            //template.update(insert2, "Papaya", 30, 10, 3);  // <-- FIX: use insert2, not insert

            // ---------------- UPDATE ----------------
            String update = "update product set price = ? where id = ?";
            //template.update(update, 70, 2);

            System.out.println("✅ Inserted and Updated successfully!");
            
            //String delete = "delete from product where id = ?";
            //template.update(delete, 4);
            
            String delete = "delete from product where id = ?";
            template.update(delete, 3);

        } catch (Exception ex) {
            System.out.println("❌ Error in db spring : " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
