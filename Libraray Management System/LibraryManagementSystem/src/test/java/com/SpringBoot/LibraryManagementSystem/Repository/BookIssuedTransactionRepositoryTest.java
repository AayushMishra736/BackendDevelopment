package com.SpringBoot.LibraryManagementSystem.Repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.RETURNS_MOCKS;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.SpringBoot.LibraryManagementSystem.Entity.Book;
import com.SpringBoot.LibraryManagementSystem.Entity.BookIssuedTransaction;
import com.SpringBoot.LibraryManagementSystem.Entity.Users;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ExtendWith(SpringExtension.class)
public class BookIssuedTransactionRepositoryTest {
	
//	@Autowired
//	private BookIssuedTransactionRepository transactionRepository;
//	
//	private BookIssuedTransaction transaction;
//	
//
//	@BeforeEach
//	public void setUpUser() {
//	transaction	=	BookIssuedTransaction.builder().
//			    bookActualreturndate(new Date()).bookIssueddate(new Date()).bookReturndate(new Date()).
//			    createdOn(new Date()).modifiedon(new Date()).remarks("Book Issued Transaction..").transactionStatus("Pending")
//			    .bookId(null)
//			    .build();
//	}
//	
//	@DisplayName("Junit test for save data in book transaction.")
//	@Test
//	public void givenBookIssuedObject_whenSave_thenReturnBookIssued() {
//		BookIssuedTransaction savedBookIssue = transactionRepository.save(transaction);
//		assertThat(savedBookIssue).isNotNull();
//		assertThat(savedBookIssue.getTransactionId()).isGreaterThan(0);
//	}
//	
//	@DisplayName("Junit test for saving multiple user.")
//	@Test
//	public void givenUserObject_whenSaveall_thenReturnUser() {
//	userRepository.save(user);
//	List<Users> allBook = userRepository.findAll();
//    assertThat(allBook.size()).isGreaterThanOrEqualTo(9);	
//	}
//	
//	@DisplayName("Junit Test for get All Employee.")
//	@Test
//	public void givenUserListObject_whenFindAll_thenReturnUserList() {
//		
//		userRepository.save(user);
//		
//		List<Users> userList = userRepository.findAll();
//		assertThat(userList).isNotNull();
//		assertThat(userList.size()).isEqualTo(9);
//	}
//	
//	@DisplayName("Junit test for getting user by user id.")
//	@Test
//	public void givenUserObject_whenFindById_thenReturnUser() {
//		userRepository.save(user);
//		Users savedUser = userRepository.findById(user.getUserId()).get();
//		assertThat(savedUser).isNotNull();
//	}
//	
//	@DisplayName("Junit test for getting user by name.")
//	@Test
//	public void givenUserObject_whenFindByName_thenReturnUser() {
//		userRepository.save(user);
//		List<Users> savedUser = userRepository.findByuserName(user.getUserName());
//		assertThat(savedUser).isNotNull();
//	}
//	
//	@DisplayName("Junit test for update user")
//	@Test
//	public void givenUserObject_whenUpdate_thenReturnUser() {
//		userRepository.save(user);
//		Users savedUser = userRepository.findById(user.getUserId()).get();
//						savedUser.setUserMailId("rahul@gmail.com");
//						savedUser.setMobileNum(99999911);
//		Users updateUser = userRepository.save(savedUser);
//		assertThat(updateUser.getUserMailId()).isEqualTo("rahul@gmail.com");
//		assertThat(updateUser.getMobileNum()).isEqualTo(99999911);
//	}
//	
//	
	
	
}
