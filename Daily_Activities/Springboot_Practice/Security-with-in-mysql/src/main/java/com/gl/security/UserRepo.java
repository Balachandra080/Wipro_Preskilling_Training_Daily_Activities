package com.gl.security;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    // Select * from user where username = ?
    Optional<User> findByUsername(String username);
}
