package com.hibernate.hibernateonetoonemapping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactid;
	
	public int getId() {
		return id;
	}
	public Users setId(int id) {
		this.id = id;
		return this;
	}
	public String getFirstname() {
		return firstname;
	}
	public Users setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	public int getContactid() {
		return contactid;
	}
	public Users setContactid(int contactid) {
		this.contactid = contactid;
		return this;
	}
	
	

}
