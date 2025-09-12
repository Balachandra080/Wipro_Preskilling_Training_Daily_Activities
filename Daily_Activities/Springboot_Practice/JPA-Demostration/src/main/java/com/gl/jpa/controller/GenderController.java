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

import com.gl.jpa.model.Gender;
import com.gl.jpa.service.GenderService;

@RestController
public class GenderController {

    @Autowired
    GenderService genderService;

    @PostMapping("/gender/add")
    public ResponseEntity<Gender> add(@RequestParam String name) {
        Gender gender = new Gender(name);
        genderService.add(gender);
        return ResponseEntity.status(HttpStatus.OK).body(gender);
    }
    
 // Get all genders
    @GetMapping("/gender/getall")
    public ResponseEntity<List<Gender>> getAll() {
        List<Gender> genders = genderService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(genders);
    }

    // Get gender by id
    @GetMapping("/gender/getbyid")
    public ResponseEntity<?> getById(@RequestParam int id) {
        try {
            Gender gender = genderService.getById(id);
            if (gender != null) {
                return ResponseEntity.status(HttpStatus.OK).body(gender);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Gender not found");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Gender not found");
        }
    }
    
 // ---------------- UPDATE ----------------
    @PutMapping("/gender/update")
    public ResponseEntity<String> update(@RequestParam int id, @RequestParam String name) {
        Gender gender = new Gender(name);
        gender.setId(id);
        genderService.update(gender);
        return ResponseEntity.status(HttpStatus.OK).body("Gender updated successfully");
    }
    
 // ---------------- DELETE ----------------
    @DeleteMapping("/gender/delete")
    public ResponseEntity<String> delete(@RequestParam int id) {
        genderService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Gender deleted successfully");
    }

}
