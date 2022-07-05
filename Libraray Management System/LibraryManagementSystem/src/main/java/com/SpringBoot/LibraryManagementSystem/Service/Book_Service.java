package com.SpringBoot.LibraryManagementSystem.Service;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.LibraryManagementSystem.Entity.Book;
import com.SpringBoot.LibraryManagementSystem.Entity.User_Table;
import com.SpringBoot.LibraryManagementSystem.Repository.Book_Repository;
import com.fasterxml.jackson.annotation.JsonFormat;



@Service
public class Book_Service {
	
	@Autowired
	private Book_Repository bookrepository;

	public Book saveProduct(Book book) {
		return bookrepository.save(book);
	}

	public List<Book> saveBook(List<Book> book) {
		return bookrepository.saveAll(book);
	}

	public List<Book> getAllBook() {
		return bookrepository.findAll();
	}

	public Book getsBookById(Long id) {
		return bookrepository.findById(id).orElse(null);
	}

	public Book getsBookByName(String name) {
		return bookrepository.findByName(name);
	}

	public Book deleteBook(Book book) {
		Book existingProduct = bookrepository.findById(book.getBook_id()).orElse(null);
		existingProduct.setActive_flag(book.getActive_flag());
		return bookrepository.save(existingProduct);	
	}

	public Book updateProduct(Book book) {
		Book existingProduct = bookrepository.findById(book.getBook_id()).orElse(null);
		existingProduct.setBook_Name(book.getBook_Name());
		existingProduct.setBook_Author(book.getBook_Author());
		existingProduct.setBook_Publication(book.getBook_Publication());
		existingProduct.setBook_Price(book.getBook_Price());
		existingProduct.setNo_Of_Copies(book.getNo_Of_Copies());
		existingProduct.setUser(book.getUser());
		existingProduct.setCreated_On(book.getCreated_On());
		existingProduct.setUser(book.getUser());
		existingProduct.setModified_on(book.getModified_on());
		existingProduct.setActive_flag(book.getActive_flag());
		return bookrepository.save(existingProduct);
	}

}
