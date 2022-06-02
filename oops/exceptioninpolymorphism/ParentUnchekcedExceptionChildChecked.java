package com.oops.exceptioninpolymorphism;

import java.io.IOException;

class ParentClass5{
	void testMethod() throws ArithmeticException {
		throw new ArithmeticException("Arithmetic Exception");
	}
}

public class ParentUnchekcedExceptionChildChecked extends ParentClass5{
    @Override
	void testMethod() throws IOException{
		throw new IOException("IO Exception");
	}
	public static void main(String[] args) {
		ParentClass5 pc = new ParentUnchekcedExceptionChildChecked();
		pc.testMethod();

	}

}
