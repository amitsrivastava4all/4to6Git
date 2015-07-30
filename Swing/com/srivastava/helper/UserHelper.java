package com.srivastava.helper;

import com.srivastava.UserDAO;
import com.srivastava.dto.UserDTO;

public class UserHelper {
	
	public boolean isUserExist(UserDTO userDTO){
		boolean isFound = false;
		UserDAO userDAO = new UserDAO();
		UserDTO  users[] = userDAO.getAllUsers();
		for(UserDTO user: users){
			if(user.getUserId().equals(userDTO.getUserId()) 
					&& user.getPassword().equals(userDTO.getPassword())){
				isFound = true;
				break;
			}
		}
		return isFound;
		
	}

}
