package com.SpringBoot.LibraryManagementSystem.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Entity
@Table(name = "Book_Issued_Transaction")
public class Book_Issued_Transaction {

    @Id
    @GeneratedValue
    private long transactionId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookId", nullable = false)
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User_Table user;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issued_To", nullable = false)
    private User_Table issued_To;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issued_By", nullable = false)
    private User_Table issued_By;
    
    private Date book_Issued_date;
    private Date book_Return_date;
    private Date book_Actual_return_date;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_By", nullable = false)
    private User_Table created_By;

    private Date created_On;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_By", nullable = false)
    private User_Table modified_By;

    private Date modified_on;

    private String transactionStatus;
    private String remarks;
    
    
    
    
    
	public Book_Issued_Transaction() {
		
	}
	public Book_Issued_Transaction(long transactionId, Book book, User_Table user, User_Table issued_To,
			User_Table issued_By, Date book_Issued_date, Date book_Return_date, Date book_Actual_return_date,
			User_Table created_By, Date created_On, User_Table modified_By, Date modified_on, String transactionStatus,
			String remarks) {
		this.transactionId = transactionId;
		this.book = book;
		this.user = user;
		this.issued_To = issued_To;
		this.issued_By = issued_By;
		this.book_Issued_date = book_Issued_date;
		this.book_Return_date = book_Return_date;
		this.book_Actual_return_date = book_Actual_return_date;
		this.created_By = created_By;
		this.created_On = created_On;
		this.modified_By = modified_By;
		this.modified_on = modified_on;
		this.transactionStatus = transactionStatus;
		this.remarks = remarks;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User_Table getUser() {
		return user;
	}
	public void setUser(User_Table user) {
		this.user = user;
	}
	public User_Table getIssued_To() {
		return issued_To;
	}
	public void setIssued_To(User_Table issued_To) {
		issued_To = issued_To;
	}
	public User_Table getIssued_By() {
		return issued_By;
	}
	public void setIssued_By(User_Table issued_By) {
		issued_By = issued_By;
	}
	public Date getBook_Issued_date() {
		return book_Issued_date;
	}
	public void setBook_Issued_date(Date book_Issued_date) {
		this.book_Issued_date = book_Issued_date;
	}
	public Date getBook_Return_date() {
		return book_Return_date;
	}
	public void setBook_Return_date(Date book_Return_date) {
		this.book_Return_date = book_Return_date;
	}
	public Date getBook_Actual_return_date() {
		return book_Actual_return_date;
	}
	public void setBook_Actual_return_date(Date book_Actual_return_date) {
		this.book_Actual_return_date = book_Actual_return_date;
	}
	public User_Table getCreated_By() {
		return created_By;
	}
	public void setCreated_By(User_Table created_By) {
		this.created_By = created_By;
	}
	public Date getCreated_On() {
		return created_On;
	}
	public void setCreated_On(Date created_On) {
		this.created_On = created_On;
	}
	public User_Table getModified_By() {
		return modified_By;
	}
	public void setModified_By(User_Table modified_By) {
		this.modified_By = modified_By;
	}
	public Date getModified_on() {
		return modified_on;
	}
	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
