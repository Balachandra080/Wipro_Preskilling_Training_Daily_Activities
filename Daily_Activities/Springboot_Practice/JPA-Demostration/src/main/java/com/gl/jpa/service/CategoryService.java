package com.gl.jpa.service;

import java.util.List;
import java.util.Optional; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.jpa.model.Category;
import com.gl.jpa.repo.CategoryRepo;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    // fetch all items by id
    public Category findById(int id) {
    	Optional<Category> categoryOpt = categoryRepo.findById(id);
    	if (categoryOpt.isEmpty() )
    	{
    		return null;
    	}
    	return categoryOpt.get();
    }
    
    //
}