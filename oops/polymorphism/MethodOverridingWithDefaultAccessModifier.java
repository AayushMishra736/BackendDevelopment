package com.oops.polymorphism;

class pack{
	void msg() {
		System.out.println("This is message from parent class.");
	}
}

public class MethodOverridingWithDefaultAccessModifier extends pack{
	@Override 
	void msg() {
		System.out.println("This is message from child class.");
	}
	public static void main(String[] args) {
		pack pc = new MethodOverridingWithDefaultAccessModifier();
		pc.msg();
	}

}
