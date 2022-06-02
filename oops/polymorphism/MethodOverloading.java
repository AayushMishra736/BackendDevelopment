package com.oops.polymorphism;

class TestOverloading{
	
	void sum(int a,int b) {
		System.out.println("Sum of two integer value is :" + (a + b));
	}
	void sum(int a,int b,int c) {
		System.out.println("Sum of three integer value is :" + (a + b + c));	
	}
	void sum(long a,long b) {
		System.out.println("Sum of two long value is :" + (a + b));
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		TestOverloading to = new TestOverloading();
		to.sum(27 ,33);
		to.sum(20, 17, 43);
	}

}
