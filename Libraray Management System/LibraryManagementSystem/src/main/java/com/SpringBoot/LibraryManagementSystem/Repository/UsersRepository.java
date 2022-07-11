package com.SpringBoot.LibraryManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.SpringBoot.LibraryManagementSystem.Entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

 List<Users> findByuserName(String name);

}
