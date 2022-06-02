package com.oops.polymorphism;


public class ComplieTimePolymorphism {
	static void show(int a,int b) {
		System.out.println("This is integer function  ");
	}
	
	static void show(double a,double b) {
		System.out.println("This is double function  ");	
	}
	
	public static void main(String[] args) {
		ComplieTimePolymorphism cp = new ComplieTimePolymorphism();
		cp.show(10, 20);
		cp.show(10.29, 23.35);

	}

}
