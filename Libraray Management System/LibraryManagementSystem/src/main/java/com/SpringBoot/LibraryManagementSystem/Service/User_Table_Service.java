package com.SpringBoot.LibraryManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.LibraryManagementSystem.Entity.User_Table;
import com.SpringBoot.LibraryManagementSystem.Repository.User_TableRepository;


@Service
public class User_Table_Service {
	
	@Autowired
	private User_TableRepository  userRepository;

	public User_Table saveUser(User_Table userTable) {
		return userRepository.save(userTable);
	}

	public List<User_Table> SaveAllUser(List<User_Table> userTable) {
		return userRepository.saveAll(userTable);
	}

	public List<User_Table> getAllUser() {
		return userRepository.findAll();
	}

	public User_Table getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	public User_Table getsBookByName(String name) {
		return userRepository.findByName(name);
	}

	
	public User_Table updateProduct(User_Table userTable) {
		User_Table existingProduct = userRepository.findById(userTable.getUserId()).orElse(null);
		existingProduct.setUserName(userTable.getUserName());
		existingProduct.setUserAge(userTable.getUserAge());
		existingProduct.setGender(userTable.getGender());
		existingProduct.setUserMailId(userTable.getUserMailId());
		existingProduct.setMobileNum(userTable.getMobileNum());
		existingProduct.setUserAddress(userTable.getUserAddress());
		existingProduct.setUserType(userTable.getUserType());
		return userRepository.save(existingProduct);
	}


}
