package com.SpringBoot.LibraryManagementSystem.Batch;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.SpringBoot.LibraryManagementSystem.Entity.Book;
import com.SpringBoot.LibraryManagementSystem.Entity.User_Table;


@Component
public class Processor implements ItemProcessor<Book,Book>{

	public static final Logger log =  LoggerFactory.getLogger(Processor.class);
	
	@Override
	public Book process(final Book book) throws Exception {
//	final Book finalbook = new Book(book.getBook_id(),book.getBook_Name(),book.getBook_Author(),book.getBook_Publication(),
//			book.getBook_Price(),book.getNo_Of_Copies(),
//			book.getCreated_On(),book.getModified_on(),book.getUser().getUserId());
		return null;
	}

//
//	public Book(int book_id, String book_Name, String book_Author, String book_Publication, int book_Price,
//			int no_Of_Copies, Date created_On, User_Table user, Date modified_on, int active_flag)
//	

}