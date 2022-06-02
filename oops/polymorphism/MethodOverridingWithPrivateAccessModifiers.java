package com.oops.polymorphism;

class A{
	private void msg() {
		System.out.println("This is message for private access modifier.");
	}
}

public class MethodOverridingWithPrivateAccessModifiers extends A{
	@Override
	private void msg() {
		System.out.println("This is message for private access modifier.");
	}
	public static void main(String[] args) {
	A a = new MethodOverridingWithPrivateAccessModifiers();
	a.msg();//c t error

	}

}
