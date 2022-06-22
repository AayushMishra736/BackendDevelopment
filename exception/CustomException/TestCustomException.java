package com.exception.CustomException;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String age) {
		super(age);
	}
	
}

public class TestCustomException {

	public static void validate(int n) throws InvalidAgeException{
		if(n < 18) {
			throw new InvalidAgeException("Cannot vote due to government restrictions.");
		}
		else {
			System.out.print("Age is valid for vote.");
		}
		
	}
	
	
	public static void main(String[] args) {
	try {
	System.out.print("Enter the age : ");	
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	validate(age);
	}
     catch(Exception e) {
    	 System.out.println("Caught The Exception...");
    	 System.out.println("Exception Occured" + e);
     }
	}

}
