package com.oops.exceptioninpolymorphism;

import java.io.IOException;

class ParentClass10{
	void testMethod() throws IOException,ArithmeticException{
		throw new IOException("IO Exception");
	}
}

public class ParentCheckedAndUncheckedExceptionChildUncheckedException extends ParentClass10{
	void testMethod() throws NullPointerException{
		throw new NullPointerException("NullPointer Exception");
	}
	public static void main(String[] args) {
		ParentClass10 pc = new ParentCheckedAndUncheckedExceptionChildUncheckedException();
		try {
			pc.testMethod();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
