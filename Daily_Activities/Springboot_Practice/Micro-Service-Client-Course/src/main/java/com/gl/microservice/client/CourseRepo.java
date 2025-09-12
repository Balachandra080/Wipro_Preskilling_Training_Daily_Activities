package com.gl.microservice.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
    // You can add custom queries if needed, for example:
    // List<Course> findByCategory_Name(String categoryName);
}
