package com.example.security.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude="userPassword")
@EqualsAndHashCode
public class UserDB {

	private Integer userId;
	private String userEmail;
	private String userName;
	private String userPassword;
}
