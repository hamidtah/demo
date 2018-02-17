package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.IUserService;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	private final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable Long id) {
		
		LOGGER.info("getUser called with, PathVariable="+id);
		
		User user = userService.getUser(id);
		
		LOGGER.info("returning user with id="+id);
		
		return user;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getUsers() {
		
		LOGGER.info("getUsers called");
		
		List<User> users = userService.getAllUsers();
		
		LOGGER.info("returning all users");
		
		return users;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		
		LOGGER.info("saveUser called with, userName="+user.getFName());
		
		User savedUser = userService.saveUpdateUser(user);
		
		LOGGER.info("returning user with id="+savedUser.getId());
		
		return savedUser;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		
		LOGGER.info("delete user called for, id="+id);
		
		boolean deleted = userService.deleteUser(id);
		
		LOGGER.info("user deleted");
	}
	
	@RequestMapping(value="/address/{id}", method=RequestMethod.DELETE)
	public void deleteAddress(@PathVariable Long id) {
		
		LOGGER.info("delete address called for, id="+id);
		
		boolean deleted = userService.deleteAddress(id);
		
		LOGGER.info("address deleted");	
	}
}
