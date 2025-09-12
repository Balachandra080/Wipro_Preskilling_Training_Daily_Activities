package com.gl.jpa.service;

import com.gl.jpa.model.Item;
import com.gl.jpa.model.Category;
import com.gl.jpa.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepo itemRepo;

    @Autowired
    CategoryService categoryService;

    // add item
    public Item add(String name, double price, Long categoryId) {
        Category category = categoryService.findById(categoryId);
        if (category == null) {
            throw new RuntimeException("Category with ID " + categoryId + " not found");
        }

        Item item = new Item(name, price, category);
        return itemRepo.save(item);
    }

    /*
     * get the list of items by the category id
     * 
     * List<item> findByCategoryId(int categoryId);
     */
    
    public List<Item> findByCategoryId(int categoryId) {
        Category category = categoryService.findById(categoryId);
        if (category == null) {
            return null;
        }

        return itemRepo.findByCategoryId(categoryId);
    }
}
