package com.oops.exceptioninabstraction;

interface MyInterface4{
	abstract void testMethod()throws ArithmeticException;
}

public class AbstractionSuperClassThrowingExceptionChildClassNotSuperType implements MyInterface4{
	@Override
	public void testMethod() throws Exception {
		System.out.print("This is complile time error");
	}
	public static void main(String[] args) {
		MyInterface4 ie = new AbstractionSuperClassThrowingExceptionChildClassNotSuperType();
		ie.testMethod();

	}

	

}
