package com.oops.inheritance;
class A{
	void play() {
		System.out.println("Print A is invoked..");
	}
}
class B extends A{
	void print() {
	System.out.println("Print B is invoked..");
	}
}
class C extends B{
	void display() {
	System.out.println("Print C is invoked..");	
	}
}

public class MultilevelInheritance extends C {

	public static void main(String[] args) {
		MultilevelInheritance a = new MultilevelInheritance();
		a.print();
		a.display();
		a.play();
	}
}
