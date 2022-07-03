package com.hibernate.hibernateonetoonemapping.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.hibernateonetoonemapping.model.Users;
import com.hibernate.hibernateonetoonemapping.repository.UsersRepository;

@RestController
public class UsersController {
	
	UsersRepository usersRepository;
	
	@GetMapping(value = "/allusers")
	public List<Users> getAllUsers(){
	return 	usersRepository.findAll();		
	}
    
}
