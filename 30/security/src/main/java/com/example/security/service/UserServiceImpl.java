package com.example.security.service;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.model.User;

@Service
public class UserServiceImpl implements UserService {

	private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>() {
		{
			put("vasya", new User("vasya", "$2a$10$RUvlfI26.wCW6MNMgQq1WOQtH1GBeHLHgv1fFBtrxkkFmj3cWPVRC"));
		}
	};

	@Autowired
	private PasswordEncoder bcryptPasswordEncoder;

	@Override
	public User getUser(String login) {
		User user = users.get(login);
		if (user != null)
			return user;
		else
			throw new UsernameNotFoundException("User not found");

	}

	@Override
	public boolean addUser(String login, String password) {
		if (users.containsKey(login))
			return false;
		else {
			users.put(login, new User(login, bcryptPasswordEncoder.encode(password)));
			return false;
		}
	}

}
