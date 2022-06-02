package com.oops.exceptioninpolymorphism;

import java.io.IOException;

class ParentClass11{
	void testMethod() throws IOException,ArithmeticException{
		throw new IOException("IO Exception");
	}
}

public class ParentCheckedAndUncheckedExceptionChildCheckedException extends ParentClass11 {
	@Override
	void testMethod() throws IOException{
		throw new IOException("IO Exception");
	}
	public static void main(String[] args) {
		ParentClass11 pe = new ParentCheckedAndUncheckedExceptionChildCheckedException();
		try {
			pe.testMethod();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
