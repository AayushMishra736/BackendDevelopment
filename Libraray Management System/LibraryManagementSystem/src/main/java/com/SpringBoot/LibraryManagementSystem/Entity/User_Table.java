package com.SpringBoot.LibraryManagementSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "User_Table")
public class User_Table {
	
    @Id
    @GeneratedValue
    private long userId;
    private String userName;
    private int userAge;
    private String gender;
    private String userMailId;
    private int mobileNum;
    private String userAddress;
    private String userType;
    
    
    
    
    
	public User_Table() {
		
	}
	
	public User_Table(long userId, String userName, int userAge, String gender, String userMailId, int mobileNum,
			String userAddress, String userType) {
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.gender = gender;
		this.userMailId = userMailId;
		this.mobileNum = mobileNum;
		this.userAddress = userAddress;
		this.userType = userType;
	}
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserMailId() {
		return userMailId;
	}
	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}
	public int getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
    
    
    
    

}
