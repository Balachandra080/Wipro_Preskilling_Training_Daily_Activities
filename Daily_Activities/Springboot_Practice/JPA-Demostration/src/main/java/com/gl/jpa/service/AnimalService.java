package com.gl.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.jpa.model.Animal;
import com.gl.jpa.repo.AnimalRepo;

@Service
public class AnimalService {

    @Autowired
    AnimalRepo repo;

    // Add new animal
    public void add(Animal animal) {
        repo.save(animal);
    }

    // Get all animals
    public List<Animal> getAll() {
        return repo.findAll();
    }

    // Get animal by ID
    public Animal getById(int id) {
        Optional<Animal> animalOpt = repo.findById(id);
        if (animalOpt.isPresent()) {
            return animalOpt.get();
        }
        return null;
    }

    // Update animal
    public void update(Animal animal) {
        repo.save(animal);
    }

    // Delete animal
    public void delete(int id) {
        Animal animal = new Animal();
        animal.setId(id);
        repo.delete(animal);
    }
}
