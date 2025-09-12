package com.gl.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.gl.pizza.model.Category;
import com.gl.pizza.model.Item;
import com.gl.pizza.service.ItemService;

@RestController
@RequestMapping("/items")  //  base path for all item endpoints
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Add item
    @PostMapping("/add")
    public ResponseEntity<Item> addItem(
            @RequestParam String name,
            @RequestParam double price,
            @RequestParam Long categoryId) {

        Category category = itemService.getCategoryById(categoryId);
        if (category == null) {
            return ResponseEntity.badRequest().body(null);
        }

        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        item.setCategory(category);

        return ResponseEntity.ok(itemService.saveItem(item));
    }

    // Get all items
    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    // Get item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        Item item = itemService.getItemById(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build();
    }

    // Get items by category
    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Item>> getItemsByCategory(@PathVariable Long categoryId) {
        return ResponseEntity.ok(itemService.getItemsByCategory(categoryId));
    }

    // Delete item
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}
