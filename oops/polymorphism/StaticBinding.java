package com.oops.polymorphism;

public class StaticBinding {
	void display() {
		System.out.println("This is display for static binding.");
	}
	void display(String str) {
		System.out.println("This is display when we pass string " + str);
	}
	public static void main(String[] args) {
		StaticBinding sb = new StaticBinding();
		sb.display();
		sb.display("City : Bangalore");
	}

}
