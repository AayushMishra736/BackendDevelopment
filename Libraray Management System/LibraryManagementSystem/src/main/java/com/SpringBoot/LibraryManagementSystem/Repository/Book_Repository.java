package com.SpringBoot.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.SpringBoot.LibraryManagementSystem.Entity.Book;
import com.SpringBoot.LibraryManagementSystem.Entity.Book_Issued_Transaction;

@EnableJpaRepositories
public interface Book_Repository extends JpaRepository<Book, Long>{

 Book findByName(String name);


	
}
