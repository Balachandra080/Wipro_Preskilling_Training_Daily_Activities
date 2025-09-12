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

import com.gl.jpa.model.Animal;
import com.gl.jpa.service.AnimalService;

@RestController
public class AnimalController {

    @Autowired
    AnimalService service;

    // POST: http://localhost:8085/animal/add
    @PostMapping("/animal/add")
    public ResponseEntity<Animal> addAnimal(@RequestParam String name, @RequestParam int age) {
        Animal animal = new Animal(name,age);
        service.add(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(animal);
    }
    
   // GET: http://localhost:8085/animal/getall
    @GetMapping("/animal/getall")
    public ResponseEntity<List<Animal>> getAll() {
        List<Animal> animals = service.getAll();  
        return ResponseEntity.status(HttpStatus.OK).body(animals);
    }
    
   // GET: http://localhost:8085/animal/getbyid?id=1
    @GetMapping("/animal/getbyid")
    public ResponseEntity<?> getById(@RequestParam int id) {
        try {
            Animal animal = service.getById(id);
            if (animal != null) {
                return ResponseEntity.status(HttpStatus.OK).body(animal);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Animal not found");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Animal not found");
        }
    }
    
   // PUT: http://localhost:8085/animal/update?id=1&name=Lion&age=7
    @PutMapping("/animal/update")
    public ResponseEntity<String> update(@RequestParam int id, @RequestParam String name, @RequestParam int age) {
        Animal animal = new Animal(name, age);
        animal.setId(id);
        service.update(animal);
        return ResponseEntity.status(HttpStatus.OK).body("Animal updated successfully");
    }

    // DELETE: http://localhost:8085/animal/delete?id=1
    @DeleteMapping("/animal/delete")
    public ResponseEntity<String> delete(@RequestParam int id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Animal deleted successfully");
    }
   
}