package com.oops.exceptioninabstraction;

import java.io.IOException;

interface MyInterface3{
	abstract void testMethod3() throws Exception;
}

public class AbstractionSuperClassThrowingExceptionChildSubTypeException implements MyInterface3{
    public void testMethod3() throws ArithmeticException{
    	throw new ArithmeticException("Arithmetic Exception");
    }
	public static void main(String[] args) {
		MyInterface3 intf = new AbstractionSuperClassThrowingExceptionChildSubTypeException();
		try{
			intf.testMethod3();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
