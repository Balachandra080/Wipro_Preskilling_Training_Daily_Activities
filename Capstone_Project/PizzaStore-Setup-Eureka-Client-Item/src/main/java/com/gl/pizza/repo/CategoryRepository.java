package com.gl.pizza.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gl.pizza.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
