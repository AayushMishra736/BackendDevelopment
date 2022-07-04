package com.hibernate.hibernatemanytoone.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer user_id;
	private String firstname;
	
	
	
	
	public User(String firstname) {
		this.firstname = firstname;
	}
	
	
	
	public User() {
		
	}



	public Integer getUser_id() {
		return user_id;
	}
	public User setUser_id(Integer user_id) {
		this.user_id = user_id;
		return this;
	}
	public String getFirstname() {
		return firstname;
	}
	public User setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
}
