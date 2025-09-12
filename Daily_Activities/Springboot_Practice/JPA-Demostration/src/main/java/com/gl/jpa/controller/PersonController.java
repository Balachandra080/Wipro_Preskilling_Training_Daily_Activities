package com.gl.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpa.service.PersonService;
import com.gl.jpa.model.Person;
import com.gl.jpa.repo.PersonRepo;
import java.util.List;


@RestController
public class PersonController {

    @Autowired
    PersonService personService;

 // Add person
    @PostMapping("/person/add")
    public ResponseEntity add(String name, int genderId) {
    	
        Person person = personService.add(name, genderId);
        if (person == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Gender id not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Person added");
    }
    
 // Get all persons
    @GetMapping("/person/getall")
    public ResponseEntity<List<Person>> getAll() {
        List<Person> persons = personService.getAll();
        System.out.println("persons count = " + persons.size());
        return ResponseEntity.status(HttpStatus.OK).body(persons);
    }
    
    @GetMapping("/person/getById")
    public ResponseEntity getById(@RequestParam int id) {
        Person person = personService.getById(id);
        if (person == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Invalid person id");
        }
        return ResponseEntity.status(HttpStatus.OK).body(person);
    }

}
