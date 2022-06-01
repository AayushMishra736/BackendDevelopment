package com.oops.exceptioninabstraction;

import java.io.IOException;

interface MyInterface2{
	abstract void testMethod() throws IOException;
}


public class AbstractionSuperClassThrowingExceptionChildNoException implements MyInterface2{

	public void testMethod() {
		System.out.println("Child class throwing no exception..");
	}
	public static void main(String[] args) {
		MyInterface2 ie = new AbstractionSuperClassThrowingExceptionChildNoException();
		try{
			ie.testMethod();
		}
     catch(Exception e) {
	    e.printStackTrace();
                             }
	}

}
