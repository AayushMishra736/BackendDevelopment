package com.oops.polymorphism;

class Parent2{  
public void msg(){
	System.out.println("Parent Say Hello..");
	}  
}  

public class MethodOverridingWithPublicAccessModifier extends Parent2{
	@Override
	public void msg(){
		System.out.println("Child Say Hello..");
		}  
	public static void main(String[] args) {
		Parent2 par = new MethodOverridingWithPublicAccessModifier();
		par.msg();
	}
}
