package com.poc.SmartContactManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.SmartContactManager.dao.UserRepository;
import com.poc.SmartContactManager.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);	
	}


	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}


	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElse(null);
	}


	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}


	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userRepo.deleteById(userId);
	}
	
	
}