package com.SpringBoot.LibraryManagementSystem.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.catalina.User;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.SpringBoot.LibraryManagementSystem.Entity.User_Table;



@ToString
@Entity
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long book_id;
	private String book_Name;
	private String book_Author;
	private String book_Publication;
	private int book_Price;
	private int no_Of_Copies;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Created_by",referencedColumnName = "userId")
	private User_Table Created_by; 
	private Date created_On;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Modified_by")
	private User_Table user;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	private Date modified_on;
	private int active_flag;
	
	
	
	
	public Book(Long book_id, String book_Name, String book_Author, String book_Publication, int book_Price,
			int no_Of_Copies, Date created_On, User_Table user, Date modified_on, int active_flag) {
		this.book_id = book_id;
		this.book_Name = book_Name;
		this.book_Author = book_Author;
		this.book_Publication = book_Publication;
		this.book_Price = book_Price;
		this.no_Of_Copies = no_Of_Copies;
		this.created_On = created_On;
		this.user = user;
		this.modified_on = modified_on;
		this.active_flag = active_flag;
	}
	
	public Book() {

	}

	public Long getBook_id() {
		return book_id;
	}

	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	public String getBook_Author() {
		return book_Author;
	}

	public void setBook_Author(String book_Author) {
		this.book_Author = book_Author;
	}

	public String getBook_Publication() {
		return book_Publication;
	}

	public void setBook_Publication(String book_Publication) {
		this.book_Publication = book_Publication;
	}

	public int getBook_Price() {
		return book_Price;
	}

	public void setBook_Price(int book_Price) {
		this.book_Price = book_Price;
	}

	public int getNo_Of_Copies() {
		return no_Of_Copies;
	}

	public void setNo_Of_Copies(int no_Of_Copies) {
		this.no_Of_Copies = no_Of_Copies;
	}

	public Date getCreated_On() {
		return created_On;
	}

	public void setCreated_On(Date created_On) {
		this.created_On = created_On;
	}

	public User_Table getUser() {
		return user;
	}

	public void setUser(User_Table user) {
		this.user = user;
	}

	public Date getModified_on() {
		return modified_on;
	}

	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}

	public int getActive_flag() {
		return active_flag;
	}

	public void setActive_flag(int active_flag) {
		this.active_flag = active_flag;
	}
}
