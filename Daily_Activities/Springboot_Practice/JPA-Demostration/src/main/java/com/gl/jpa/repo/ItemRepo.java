package com.gl.jpa.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gl.jpa.model.Item;

public interface ItemRepo extends JpaRepository<Item, Long> {

	// get the list of items by the category id
    List<Item> findByCategoryId(int categoryId);

    // get the list of items by the category id and more than given price
    List<Item> findByCategoryIdAndPriceGreaterThan(int categoryId, double price);

    // price >= ?
    List<Item> findByPriceGreaterThanEqual(double price);

    // filter by category id and arrange by name [A-Z]
    List<Item> findByCategoryIdOrderByName(int categoryId);

    // filter by category id and arrange by price in descending order
    List<Item> findByCategoryIdOrderByPriceDesc(int categoryId);

    // name must exactly match and also it is case sensitive
    List<Item> findByName(String name);

    // name must exactly match and it is case insensitive
    List<Item> findByNameIgnoreCase(String name);

    // select * from item where name like '%name%'
    List<Item> findByNameContaining(String name);

    // select * from item where name like 'name%'
    List<Item> findByNameStartingWith(String name);

    // select * from item where name like 'name%' (ignore case)
    List<Item> findByNameStartingWithIgnoreCase(String name);

    // select * from item where name like '%name'
    List<Item> findByNameEndingWith(String name);
}