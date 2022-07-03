package com.hibernate.hibernateonetoonemapping.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ContactInfo")
public class ContactInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long contactNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contact_id",referencedColumnName = "contactid")
	private Users user;

	
	
	public ContactInfo() {
		
	}

	public ContactInfo(int id, long contactNumber, Users user) {
		super();
		this.id = id;
		this.contactNumber = contactNumber;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public ContactInfo setId(int id) {
		this.id = id;
		return this;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public ContactInfo setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
		return this;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	

}
