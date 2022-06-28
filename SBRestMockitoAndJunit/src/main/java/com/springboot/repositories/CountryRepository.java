package com.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entities.Country;



public interface CountryRepository extends JpaRepository<Country,Integer>{

}
