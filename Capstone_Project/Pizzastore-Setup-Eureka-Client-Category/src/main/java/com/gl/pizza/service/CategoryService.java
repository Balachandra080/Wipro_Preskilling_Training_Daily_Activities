package com.gl.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.pizza.model.Category;
import com.gl.pizza.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

	@Autowired
    private  CategoryRepository repo;


    public Category addCategory(Category category) {
        return repo.save(category);
    }

    public List<Category> listAll() {
        return repo.findAll();
    }

    public Category updateCategory(Long id, Category updated) {
        return repo.findById(id)
                .map(c -> {
                    c.setName(updated.getName());
                    return repo.save(c);
                })
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public void deleteCategory(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Category not found");
        }
        repo.deleteById(id);
    }

    public Category getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }
}
