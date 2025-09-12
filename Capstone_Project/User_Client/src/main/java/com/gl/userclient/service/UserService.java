package com.gl.userclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gl.userclient.model.User;
import com.gl.userclient.repositary.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

    public User register(User user) {
        return userRepo.save(user); 
    }
	
    public User findByUsername(String username) {
        return userRepo.findByUsername(username).orElse(null);
    }

}
