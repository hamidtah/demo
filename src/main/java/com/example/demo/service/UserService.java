package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.IAddressRepository;
import com.example.demo.repository.IUserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IAddressRepository addressRepository;
	
	@Override
	public User getUser(Long userId) {
		
		User user = userRepository.findOne(userId);
		return user;
	}
	
	@Override
	public List<User> getAllUsers() {
		
		List<User> user = StreamSupport.stream(userRepository.findAll().spliterator(), false).collect(Collectors.toList());
		return user;
	}
	
	@Override
	public User saveUpdateUser(User user) {
		
		User persisted = null;
		
		if (user != null)
			persisted = userRepository.save(user);
		
		return persisted;
	}

	@Override
	public boolean deleteAddress(Long id) {

		addressRepository.delete(id);
		return true;
	}
	
	@Override
	public boolean deleteUser(Long id) {

		userRepository.delete(id);
		return true;
	}
}
