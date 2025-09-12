package com.gl.userclient.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.userclient.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
	 Optional<User> findByUsername(String username);
	

}
