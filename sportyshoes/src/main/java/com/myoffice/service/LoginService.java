package com.myoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myoffice.Entity.Login;
import com.myoffice.Entity.UserDetails;
import com.myoffice.Repository.LoginRepository;


@Service
public class LoginService{
	@Autowired
	private LoginRepository repo;
	 public Login signgin(String username, String password) {
		  Login user = repo.findByUsernameAndPassword(username, password);
		  System.out.println("from service" + user);
		  
	  	return user;
	  }
	 
	public Login changePassword(String username, String newpassword) {
		
		Login uplogin = null;
		Login user1 = repo.findByUsername(username);
		if(user1 !=null ) {
			System.out.println("user1" + user1);
			repo.changePassword(newpassword, user1.getId());
			uplogin = repo.findByUsername(username);
			System.out.println("Password Changed");
			return uplogin;
		}
		return null;
	}
}
