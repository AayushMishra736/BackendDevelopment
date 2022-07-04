package com.hibernate.hibernatemanytoone.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.hibernatemanytoone.Repository.UserLogInterface;
import com.hibernate.hibernatemanytoone.model.User;
import com.hibernate.hibernatemanytoone.model.UserLog;

@RestController
public class UserLogController {
	
	private UserLogInterface userLogInterface;
	
	public UserLogController(UserLogInterface userLogInterface) {
		this.userLogInterface = userLogInterface;
	}

	@GetMapping(value = "/getAllUserLog")
	public List<UserLog> getAllData(){
	return userLogInterface.findAll();
	}
	
	@GetMapping(value = "/update{name}")
	public List<UserLog> updateAllLogs(@PathVariable final String name){
		
	User user = new User();
	user.setFirstname(name);
	
	UserLog userlog1 = new UserLog();
	userlog1.setUser(user);
	userlog1.setLog("This is firstlog in the user's session");
	userLogInterface.save(userlog1);
	
	UserLog userlog2 = new UserLog();
	userlog2.setUser(user);
	userlog2.setLog("This is secondlog in the user's session");
	userLogInterface.save(userlog2);	
	
	return userLogInterface.findAll();
	}
	
	
}
