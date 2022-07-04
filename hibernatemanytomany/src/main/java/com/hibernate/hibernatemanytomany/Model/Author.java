package com.hibernate.hibernatemanytomany.Model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int author_id;
	private String author_name;
	
	@ManyToMany(mappedBy="authors")
	private List<Book> book = new ArrayList<>();

	public Author(int author_id, String author_name, List<Book> book) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.book = book;
	}
	public Author() {

	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public List<Book> getAuthor() {
		return book;
	}
	public void setAuthor(List<Book> book) {
		this.book = book;
	}
	
	
}
