package com.SpringBoot.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.SpringBoot.LibraryManagementSystem.Entity.User_Table;

@EnableJpaRepositories
public interface User_TableRepository extends JpaRepository<User_Table, Long>{

	User_Table findByName(String name);

}
