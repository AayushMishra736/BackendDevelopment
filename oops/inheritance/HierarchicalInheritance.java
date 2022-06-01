package com.oops.inheritance;

class Animal{
	void eat() {
		System.out.println("Animal Is Eating..");
	}
}
class Elephant extends Animal{
	void trumpet() {
		System.out.println("Elephant Trumpet..");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("Cat Meow..");	
	}
}

public class HierarchicalInheritance extends Cat{
	public static void main(String[] args) {
	HierarchicalInheritance he = new HierarchicalInheritance();
	he.eat();
	he.meow();
	}
}
