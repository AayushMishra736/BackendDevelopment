package com.oops.exceptioninpolymorphism;

import java.io.IOException;

class ParentClass7{
	void testMethod() throws IOException{
		throw new IOException("IOException");
	}
	
}

public class ParentCheckedExceptionChildUncheckedException extends ParentClass7{

	void testMethod() throws ArithmeticException{
		throw new ArithmeticException("Arithmetic Exception");
	}
	public static void main(String[] args) {
		ParentClass7 pc = new ParentCheckedExceptionChildUncheckedException();
			try {
				pc.testMethod();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
