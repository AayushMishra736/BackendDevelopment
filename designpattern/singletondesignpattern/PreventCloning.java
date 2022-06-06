package com.designpattern.singletondesignpattern;


class SuperClass2 implements Cloneable
{
int i = 10;

@Override
protected Object clone() throws CloneNotSupportedException 
{
 return super.clone();
}
}


class Singleton4 extends SuperClass2
{

public static Singleton4 obj = new Singleton4();

private Singleton4() 
{

}

@Override
protected Object clone() throws CloneNotSupportedException 
{
return obj;   }
}
public class PreventCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton4 instance1 = Singleton4.obj;
		Singleton4 instance2 = (Singleton4) instance1.clone();
	    System.out.println("instance1 hashCode:- " + instance1.hashCode());
	    System.out.println("instance2 hashCode:- " + instance2.hashCode()); 

	}

}
