package com.gl.spring;



import java.sql.ResultSet;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;



public class DBSelect {

	public static void main(String args[]) {
		try {
			String url = "jdbc:mysql://localhost:3306/wipro_2025_java_web";
			String username = "root";
			String password = "Balachandra@123";

			SimpleDriverDataSource dataSource =  new SimpleDriverDataSource();

			dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);

			JdbcTemplate template = new JdbcTemplate(dataSource);

			String select = "select * from product";

			List products = template.query(select, new RowMapper(){

				public Object mapRow(ResultSet rs, int rowNum) {
					try {
						Product temp = new Product();
						temp.setId(rs.getInt("id"));
						temp.setName(rs.getString("name"));
						temp.setPrice(rs.getInt("price"));
						temp.setDiscount(rs.getInt("discount"));
						temp.setUnit(rs.getInt("unit"));
						return temp;
					} catch(Exception ex) {
						System.out.println("Error in RowMapper : " + ex.getMessage());
					}
					return null;
				}
			});


			System.out.println("------");

			for(int i = 0; i < products.size(); i++) {
				Product temp = (Product) products.get(i);
				System.out.println("Name : " + temp.getName());
			}


		} catch(Exception ex) {
			System.out.println("Error in db spring: " + ex.getMessage());
		}
	}

}