package com.example.security.service;

import java.util.List;

import com.example.security.model.UserDB;

public interface UserDBService {
	
	List<UserDB> getAllUsers();
	
	boolean addUser(UserDB user);
	
	boolean deleteUserById(Integer id);
}
