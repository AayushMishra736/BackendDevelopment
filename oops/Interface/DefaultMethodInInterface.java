package com.oops.Interface;

interface Drawable{
	void draw();
	default void msg() {
		System.out.println("Default Method Called From Drawable Interface.");
	}
}

interface Shapeable{
	default void msg() {
		System.out.println("Default Method Called From Shapeable Interface.");
	} 
}

class Rectangle implements Drawable,Shapeable{
	public void draw() {
		System.out.println("Draw Method from Reactangle Called.");
	}

	@Override
	public void msg() {
	Drawable.super.msg();
	}
}

public class DefaultMethodInInterface extends Rectangle{
	public static void main(String[] args) {
		Drawable dw = new Rectangle();
		dw.draw();
		dw.msg();
	}
}
