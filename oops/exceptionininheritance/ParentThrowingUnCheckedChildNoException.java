package com.oops.exceptionininheritance;

class ParentClass2{
	void method() throws RuntimeException{
		throw new RuntimeException("Runtime Exception");
	}
}

public class ParentThrowingUnCheckedChildNoException extends ParentClass2{
	void method() {
		System.out.println("This is child class exception");
	}
	public static void main(String[] args) {
		ParentClass2 pc = new ParentThrowingUnCheckedChildNoException();
		pc.method();

	}

}
