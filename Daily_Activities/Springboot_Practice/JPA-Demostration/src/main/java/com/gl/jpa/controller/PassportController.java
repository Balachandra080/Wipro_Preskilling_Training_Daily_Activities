package com.gl.jpa.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.gl.jpa.service.PassportService;
import com.gl.jpa.model.Passport;

@RestController

public class PassportController {
	
	@Autowired
	PassportService passportService;
	
	// Add passport
    @PostMapping("/passport/add")
    public ResponseEntity<?> add(
            @RequestParam String passportNumber,
            @RequestParam int personId) {

        Passport passport = passportService.add(passportNumber, personId);

        if (passport == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Person id not found");
        }
        return ResponseEntity.status(HttpStatus.CREATED)
                             .body("Passport Added"); // return created passport object
    }

	
    
 // Get all passports
    @GetMapping("/passport/getall")
    public ResponseEntity<List<Passport>> getAll() 
    {
        List<Passport> passports = passportService.getAll();
        return ResponseEntity.ok(passports);
    }
    
    // Get passport by ID
    @GetMapping("/passport/getbyid")
    public ResponseEntity<?> getById(@RequestParam int id) {
        Passport passport = passportService.getById(id);
        if (passport != null) {
            return ResponseEntity.ok(passport);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Passport not found");
    }
    
    // Delete passport by id
    @DeleteMapping("/passport/delete")
    public ResponseEntity<?> delete(@RequestParam int id) {
        boolean deleted = passportService.delete(id);

        if (deleted) {
            return ResponseEntity.ok("Passport deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Passport not found");
        }
    }
    
    // Update
    
 // Update passport by id
    @PutMapping("/passport/update")
    public ResponseEntity<?> update(
            @RequestParam int passportId,
            @RequestParam String passportNumber,
            @RequestParam int personId) {

        Passport updatedPassport = passportService.update(passportId, passportNumber, personId);

        if (updatedPassport == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Passport or Person not found");
        }
        return ResponseEntity.ok(updatedPassport);
    }

    
	
}


