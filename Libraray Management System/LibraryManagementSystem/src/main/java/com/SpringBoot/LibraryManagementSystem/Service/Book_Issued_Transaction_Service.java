package com.SpringBoot.LibraryManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.SpringBoot.LibraryManagementSystem.Entity.Book_Issued_Transaction;
import com.SpringBoot.LibraryManagementSystem.Repository.Book_Issued_Transaction_Repository;


@Service
public class Book_Issued_Transaction_Service {
	
	@Autowired
	private Book_Issued_Transaction_Repository bookTransactionRepository;
	
	public Book_Issued_Transaction saveTransacion(Book_Issued_Transaction Book_Issued_Transaction){
		return bookTransactionRepository.save(Book_Issued_Transaction);
	}
	
	public List<Book_Issued_Transaction> getAllBookTransaction(){
		return bookTransactionRepository.findAll();
	}

	public Book_Issued_Transaction getBookByBookId(Long id){
		return bookTransactionRepository.findById(id).orElse(null);
	}
	public Book_Issued_Transaction getBookByName(String name) {
		return bookTransactionRepository.findByName(name);
	}
	public Book_Issued_Transaction getBookByUserId(Long id) {
		return bookTransactionRepository.findById(id).orElse(null);
	}
	public Book_Issued_Transaction updateBookTransaction(Book_Issued_Transaction bookIssuedTransaction) {
		Book_Issued_Transaction existingProduct = bookTransactionRepository.findById(bookIssuedTransaction.getTransactionId()).orElse(null);
		existingProduct.setBook_Actual_return_date(bookIssuedTransaction.getBook_Actual_return_date());
		existingProduct.setBook_Issued_date(bookIssuedTransaction.getBook_Issued_date());
		existingProduct.setBook_Return_date(bookIssuedTransaction.getBook_Return_date());
		existingProduct.setCreated_On(bookIssuedTransaction.getCreated_On());
		existingProduct.setModified_on(bookIssuedTransaction.getModified_on());
		existingProduct.setRemarks(bookIssuedTransaction.getRemarks());
		existingProduct.setTransactionStatus(bookIssuedTransaction.getTransactionStatus());
		existingProduct.setIssued_By(bookIssuedTransaction.getIssued_By());
		existingProduct.setIssued_To(bookIssuedTransaction.getIssued_To());
		existingProduct.setBook(bookIssuedTransaction.getBook());
		existingProduct.setCreated_By(bookIssuedTransaction.getCreated_By());
		existingProduct.setModified_By(bookIssuedTransaction.getModified_By());
		existingProduct.setUser(bookIssuedTransaction.getUser());
		return bookTransactionRepository.save(existingProduct);
		
	}
	
	
	
}
