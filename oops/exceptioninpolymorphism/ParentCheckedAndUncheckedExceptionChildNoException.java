package com.oops.exceptioninpolymorphism;

import java.io.IOException;

class ParentClass12{
	void testMethod() throws IOException,ArithmeticException{
		throw new IOException();
	}
}

public class ParentCheckedAndUncheckedExceptionChildNoException extends ParentClass12{
void testMethod() {
	System.out.print("This is test method call from child class...");
}

public static void main(String [] args) {
	ParentClass12 pc = new ParentCheckedAndUncheckedExceptionChildNoException();
	try{
		pc.testMethod();
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}



}
