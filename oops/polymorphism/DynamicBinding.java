package com.oops.polymorphism;

class Dynamic{
	void call() {
		System.out.println("This is dynamic method call.");
	}
}

public class DynamicBinding extends Dynamic{
	@Override
	void call() {
		System.out.println("This is call function inside dynamic binding class.");
	}
	public static void main(String[] args) {
	Dynamic dy = new DynamicBinding();
	dy.call();
	}
}
