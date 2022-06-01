package com.oops.exceptionininheritance;

import java.io.IOException;

class ParentClass3{
	void method() {
     System.out.println("This is parent class method");
	}
}

public class ChildClassThrowingCheckedException extends ParentClass3{
	@Override
	public void method() throws IOException{
		throw new IOException("IOException");
	}
	public static void main(String[] args) {
		ParentClass3 pc = new ChildClassThrowingCheckedException();
		pc.method();

	}

}
