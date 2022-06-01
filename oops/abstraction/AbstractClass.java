package com.oops.abstraction;

abstract class Shape{
	Shape(){
		System.out.println("Shape is created.");
	}
	abstract void draw();
	void redraw() {
		System.out.println("Redrawing the shape.");
	}
}

class Reactangle extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle.");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		Shape sp = new Reactangle();
		sp.draw();
		sp.redraw();

	}

}
