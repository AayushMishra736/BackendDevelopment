package com.oops.inheritance;

interface MyInterface1{
	public void one();
}
interface MyInterface2{
	public void one();
}
interface MyInterface3 extends MyInterface1,MyInterface2{
	public void two();
}

class child implements MyInterface3{
	@Override 
	public void one() {
		System.out.println("One Method called from child class.");
	}
	@Override
	public void two() {
		System.out.println("Two Method called from child class.");
	}
}

public class MultipleInheritances {
	public static void main(String[] args) {
		child ch = new child();
		ch.one();
		ch.two();
	}
}
