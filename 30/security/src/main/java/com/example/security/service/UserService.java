package com.example.security.service;

import com.example.security.model.User;

public interface UserService {
	User getUser(String login);
	
	boolean addUser(String login, String password);
}
