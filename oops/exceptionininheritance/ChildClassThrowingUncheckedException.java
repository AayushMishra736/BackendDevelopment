package com.oops.exceptionininheritance;

class ParentClass4{
	void method() {
	     System.out.println("This is parent class method");
		}
}
public class ChildClassThrowingUncheckedException extends ParentClass4{

	void method() throws RuntimeException{
		throw new RuntimeException("Runtime Exception");
	}
	public static void main(String[] args) {
		ParentClass4 pc = new ChildClassThrowingUncheckedException();
		pc.method();
	}

}
