package com.oops.exceptioninpolymorphism;

class ParentClass3 {
	public void testMethod() {

	}
}

public class ParentNoExceptionChildNoException extends ParentClass3 {
	@Override
	public void testMethod() {
		System.out.println("Test class method called from child class.");
	};

	public static void main(String[] args) {
				ParentClass3 me = new ParentNoExceptionChildNoException();
				me.testMethod();
     }
}