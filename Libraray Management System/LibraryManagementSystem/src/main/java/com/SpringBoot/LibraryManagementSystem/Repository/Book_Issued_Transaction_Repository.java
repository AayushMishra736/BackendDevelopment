package com.SpringBoot.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.SpringBoot.LibraryManagementSystem.Entity.Book_Issued_Transaction;




@EnableJpaRepositories
public interface Book_Issued_Transaction_Repository extends JpaRepository<Book_Issued_Transaction, Long> {

	Book_Issued_Transaction findByName(String name);
	
	
}

