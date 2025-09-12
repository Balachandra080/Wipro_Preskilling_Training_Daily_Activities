/*
package com.gl.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;   // For Model
import java.util.List;                 // For List
import java.util.Map;                  // For Map

@Controller
public class HotelController 
{

    @RequestMapping("/")   // default mapping
    public String addHotelForm() {
        return "addhotel";
    }

    @PostMapping("/savehotel")
    public String saveHotel(@RequestParam("name") String name,
                            @RequestParam("address") String address) 
    {
        try 
        {
            String url = "jdbc:mysql://localhost:3306/wipro_2025_hibernate";
            String username = "root";
            String password = "Balachandra@123";

            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
            dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            JdbcTemplate template = new JdbcTemplate(dataSource);
            String insert = "insert into hotel(name, address) values(?, ?)";
            template.update(insert, name, address);

            return "insertsuccess";

        } 
        catch (Exception ex) 
        {
            System.out.println("Error : " + ex.getMessage());
            return "insertfail";
        }
    }
    
    @RequestMapping("/hotel-list")
    public String readHotels(Model model) {
        try {
            String url = "jdbc:mysql://localhost:3306/wipro_2025_hibernate";
            String username = "root";
            String password = "Balachandra@123";

            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
            dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            JdbcTemplate template = new JdbcTemplate(dataSource);

            // Query all hotels
            String select = "SELECT * FROM hotel";
            List<Map<String, Object>> hotels = template.queryForList(select);

            // Add data to model
            model.addAttribute("hotels", hotels);

            return "hotellist";   // JSP page to display list
        } catch (Exception e) {
            e.printStackTrace();
            return "hotellisterror";   // Error JSP page
        }
    }
    
    
    @RequestMapping("/hotel-list")
    public String readHotels(Model model) 
    {
    	@SuppressWarnings("unchecked")
		List<Hotel> hotels = service.getAllHotels();

        if (hotels == null || hotels.isEmpty()) 
        {
            return "hotellisterror"; // JSP for error handling
        } 
        else 
        {
            model.addAttribute("hotels", hotels);
            return "hotellist"; // JSP to display hotels
        }
    }
}

*/



package com.gl.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.controller.Hotel;

@Controller
public class HotelController 
{

    @RequestMapping("/")
    public String addHotelForm() 
    {
        return "addhotel";  // JSP form page (/WEB-INF/views/addHotel.jsp)
    }
    @Autowired
    private HotelService service;
    
    @PostMapping("/savehotel")
    public String saveHotel(@RequestParam("name") String name,
                            @RequestParam("address") String address) 
    {
        try 
        {
            boolean status = service.addHotel(name, address);

            if (status) 
            {
                return "insertsuccess";  // forwards to insertsuccess.jsp
            } 
            else 
            {
                return "insertfail";     // forwards to insertfail.jsp
            }
        } 
        catch (Exception ex) 
        {
            System.out.println("Error while saving hotel: " + ex.getMessage());
            return "insertfail";
        }
    }
    @RequestMapping("/hotel-list")
    public String readHotels(Model model) 
    {
    	@SuppressWarnings("unchecked")
		List<Hotel> hotels = service.getAllHotels();

        if (hotels == null || hotels.isEmpty()) 
        {
            return "hotellisterror"; // JSP for error handling
        } 
        else 
        {
            model.addAttribute("hotels", hotels);
            return "hotellist"; // JSP to display hotels
        }
    }
}