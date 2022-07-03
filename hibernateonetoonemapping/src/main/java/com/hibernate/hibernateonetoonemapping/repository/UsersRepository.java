package com.hibernate.hibernateonetoonemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hibernate.hibernateonetoonemapping.model.Users;

@EnableJpaRepositories
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
