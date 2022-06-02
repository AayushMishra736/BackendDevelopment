package com.oops.exceptioninpolymorphism;

import java.io.IOException;

class ParentClass2{
	void testmethod() {
		System.out.print("This is test method call of parent class.");
	}
}

public class ParentNoExceptionChildClassCheckedException extends ParentClass2{
    @Override
    void testmethod() throws IOException{
    	throw new IOException("IO Exception");
    }
	public static void main(String[] args) {
		ParentClass2 pc = new ParentNoExceptionChildClassCheckedException();
		pc.testmethod();

	}

}
