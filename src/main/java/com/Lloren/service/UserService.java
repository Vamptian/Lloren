package com.Lloren.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lloren.entity.User;
import com.Lloren.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public void save(User user) {
		
		userRepo.save(user);
		
	}
	
	public User signIn(User user) throws Exception {
		
		User foundUser = userRepo.signIn(user.getUsername(), user.getPassword());
		if(foundUser == null) {
			throw new Exception("Incorrect login info");
		}
		return foundUser;
	}
	
	
}
