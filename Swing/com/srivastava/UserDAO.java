package com.srivastava;

import com.srivastava.dto.UserDTO;

public class UserDAO {
	private UserDTO users[] = new UserDTO[5];
	public UserDAO(){
		UserDTO userObject = new UserDTO();
		userObject.setUserId("amit");
		userObject.setPassword("1234");
		users[0] = userObject;
		
		userObject = new UserDTO();
		userObject.setUserId("ram");
		userObject.setPassword("1234");
		users[1] = userObject;
		
		userObject = new UserDTO();
		userObject.setUserId("shyam");
		userObject.setPassword("1234");
		users[2] = userObject;
		
		userObject = new UserDTO();
		userObject.setUserId("kim");
		userObject.setPassword("1234");
		users[3] = userObject;
		
		userObject = new UserDTO();
		userObject.setUserId("tim");
		userObject.setPassword("1234");
		users[4] = userObject;
	}

	public UserDTO[] getAllUsers(){
		return users;
	}

}
