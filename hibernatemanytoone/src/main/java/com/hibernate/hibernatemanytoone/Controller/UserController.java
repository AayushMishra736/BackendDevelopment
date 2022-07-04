package com.hibernate.hibernatemanytoone.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.hibernatemanytoone.Repository.UserInterface;
import com.hibernate.hibernatemanytoone.model.User;

@RestController
public class UserController {
	
	UserInterface userinterface;
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
	return userinterface.findAll();
	}

}
