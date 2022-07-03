package com.hibernate.hibernateonetoonemapping.Controller;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.hibernateonetoonemapping.model.ContactInfo;
import com.hibernate.hibernateonetoonemapping.model.Users;
import com.hibernate.hibernateonetoonemapping.repository.ContactRepository;

@RestController
public class ContactController {

	@Autowired
	ContactRepository contactRepository;
	
	@GetMapping(value = "/allContacts")
	public List<ContactInfo> getAllContactInfo(){
	return contactRepository.findAll();	
	}
	
	@GetMapping(value = "/insertdata{name}")
	public List<ContactInfo> setAllContactInfo(@PathVariable final String name){
	ContactInfo cn = new ContactInfo();
	Users users = new Users();
	users.setFirstname(name).setContactid(101);
	
	
	cn.setContactNumber(1111111).setUser(users);
	contactRepository.save(cn);
	
	return contactRepository.findAll();	
	}
	
	
	
	
	
}
