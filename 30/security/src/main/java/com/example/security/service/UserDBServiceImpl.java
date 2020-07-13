package com.example.security.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.security.model.UserDB;

@Service
public class UserDBServiceImpl implements UserDBService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<UserDB> getAllUsers() {
		List<UserDB> users = jdbcTemplate.query("SELECT * FROM public.\"User\"", new RowMapper<UserDB>() {

			@Override
			public UserDB mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDB user = new UserDB();
				
				user.setUserId(rs.getInt("user_id"));
				user.setUserEmail(rs.getString("user_email"));
				user.setUserName(rs.getString("user_name"));
				user.setUserPassword(rs.getString("user_password"));
				
				return user;
			}
			
		});
		return users;
	}

	@Override
	public boolean addUser(UserDB user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
