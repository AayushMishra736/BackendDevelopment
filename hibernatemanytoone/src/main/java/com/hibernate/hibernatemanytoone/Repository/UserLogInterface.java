package com.hibernate.hibernatemanytoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hibernate.hibernatemanytoone.model.UserLog;

@EnableJpaRepositories
public interface UserLogInterface extends JpaRepository<UserLog, Integer>{

}
