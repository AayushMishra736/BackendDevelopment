package com.hibernate.hibernateonetoonemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hibernate.hibernateonetoonemapping.model.ContactInfo;

@EnableJpaRepositories
public interface ContactRepository extends JpaRepository<ContactInfo, Integer>{

}
