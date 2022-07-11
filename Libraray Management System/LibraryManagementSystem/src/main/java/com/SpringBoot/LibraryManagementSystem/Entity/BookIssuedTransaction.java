package com.SpringBoot.LibraryManagementSystem.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Book_Issued_Transaction")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BookIssuedTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;

	@ManyToOne
	@JoinColumn(name = "bookId", nullable = false)
	private Book bookId;

	@ManyToOne
	@JoinColumn(name = "userId", nullable = false)
	private Users userId;

	@ManyToOne
	@JoinColumn(name = "issued_To", nullable = false)
	private Users issued_To;

	@ManyToOne
	@JoinColumn(name = "issued_By", nullable = false)
	private Users issued_By;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date bookIssueddate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date bookReturndate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date bookActualreturndate;

	@ManyToOne
	@JoinColumn(name = "createdBy", nullable = false)
	private Users createdBy;
 

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date createdOn;

	@ManyToOne
	@JoinColumn(name = "modifiedBy", nullable = false)
	private Users modifiedBy;


	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date modifiedon;

	private String transactionStatus;
	private String remarks;
	
	
	
}
