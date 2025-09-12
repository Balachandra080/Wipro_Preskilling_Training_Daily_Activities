package com.gl.security;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Integer> {

    // Select * from role where name = ?
    Optional<Role> findByName(String name);
}
