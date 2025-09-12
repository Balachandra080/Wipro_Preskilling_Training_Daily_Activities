package com.gl.pizza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.pizza.model.Item;
import com.gl.pizza.model.Category;
import com.gl.pizza.repo.ItemRepository;
import com.gl.pizza.repo.CategoryRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    // Fetch category by ID
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Save or update item
    public Item saveItem(Item item) {
        // Ensure full category object is set
        if (item.getCategory() != null && item.getCategory().getId() != null) {
            Category category = getCategoryById(item.getCategory().getId());
            if (category == null) {
                throw new RuntimeException("Category not found with id: " + item.getCategory().getId());
            }
            item.setCategory(category);
        }
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    public List<Item> getItemsByCategory(Long categoryId) {
        return itemRepository.findByCategoryId(categoryId);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
