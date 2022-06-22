package com.exception.ThrowAndThrows;

class UserDefinedException extends Exception{
public UserDefinedException(String s) {
	super(s);
}
}

public class ThrowingUserDefinedException {
	public static void main(String[] args) {
    try {	
    	throw new UserDefinedException("This is user defined exception.");
    }
    catch(UserDefinedException e) {
    System.out.println("Exception Caught.");
    System.out.println(e.getMessage());	
    }
	}

}
