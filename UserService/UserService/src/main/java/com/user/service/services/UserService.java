package com.user.service.services;

import java.util.List;

import com.user.service.entities.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
	
	//TODO: delete
	//TODO: update

	
	
	

	
}
