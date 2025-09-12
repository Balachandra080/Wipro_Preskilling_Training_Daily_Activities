package com.gl.spring;

import java.sql.ResultSet;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Dbselect {

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

			// ✅ selecting from "book"
			String select = "select * from book";

			List books = template.query(select, new RowMapper(){

				public Object mapRow(ResultSet rs, int rowNum) {
					try {
						Book temp = new Book();
						temp.setName(rs.getString("name"));
						temp.setAuthor(rs.getString("author"));
						temp.setPrice(rs.getDouble("price"));
						return temp;
					} catch(Exception ex) {
						System.out.println("Error in RowMapper : " + ex.getMessage());
					}
					return null;
				}
			});

			System.out.println("------");

			for(int i = 0; i < books.size(); i++) {
				Book temp = (Book) books.get(i);
				System.out.println("Name   : " + temp.getName());
				System.out.println("Author : " + temp.getAuthor());
				System.out.println("Price  : " + temp.getPrice());
			}

		} catch(Exception ex) {
			System.out.println("Error in db spring: " + ex.getMessage());
		}
	}
}
