package com.project.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.model.User;
import com.project.backend.service.UserService;

@RestController
public class ClientController {

	@Autowired
	private UserService userService;
	
	//helloWord
	@GetMapping("/")
	public String hello() {
		return "Hello Word";
	}
	
	//Rest API - CRUD
	//Create(read) User - POST
	//Read(listar) User - GET
	//Delete User - DELETE
	//Update User - PUT
	
	//create user
	@PostMapping("/add")
	public User createUser(@RequestBody User user) {
		User user1 = userService.createUser(user);
		return user1;
	}
	
	//Read(listar)
	@GetMapping("/users")
	public List<User> getUser(){
		return userService.getUser();
	}
	
	//update - PUT
	@PutMapping("/update/{id}")
	public User updateUserById(@RequestBody User user, @PathVariable("id") long id) {
		return userService.updateUser(user, id);
	}
	
	//Delete user by id
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id) {
	  userService.deleteUser(id);
	  return "Apagado com sucesso!";
	}
	
	//get User by id
	@GetMapping("/user/{id}")
	public User getById(@PathVariable("id") long id) {
	 return userService.getUserById(id);
	}
}
