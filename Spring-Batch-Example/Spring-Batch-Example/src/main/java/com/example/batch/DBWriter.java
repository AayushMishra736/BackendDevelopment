package com.example.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Model.User;
import com.example.Repository.UserRepository;

public class DBWriter implements ItemWriter<User>{

    @Autowired
     private UserRepository userRepository;
	

	@Override
	public void write(List<? extends User> users) throws Exception {
		
		System.out.println("Data Saved For Users :" + users);
		userRepository.saveAll(users);
		
	}

}
