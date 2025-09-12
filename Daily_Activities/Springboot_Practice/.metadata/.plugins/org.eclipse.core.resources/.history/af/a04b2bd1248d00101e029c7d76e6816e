package com.gl.security.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.security.model.Item;

public interface ItemRepo extends JpaRepository<Item, Long>{
	List<Item> findByCategoryId(Long categoryId);

}
