package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.User;

public interface IUserService {

	public User getUser(Long userId);

	public User saveUpdateUser(User user);

	public boolean deleteAddress(Long id);

	public boolean deleteUser(Long id);

	public List<User> getAllUsers();
	
}
