package com.project.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.backend.model.User;

@Service
public interface UserService {

	//create user
	public User createUser(User user);
	
	//read users - Listar
	public List<User> getUser();
	
	//read users by id - Listar pelo id
	public User getUserById(long id);
	
	//delete user by id
	public void deleteUser(long id);
	
	//update user by id
	public User updateUser(User user, long id);
}
