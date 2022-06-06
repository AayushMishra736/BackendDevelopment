package com.designpattern.singletondesignpattern;

class SuperClass implements Cloneable
{
  int i = 10;
  
  @Override
  protected Object clone() throws CloneNotSupportedException 
  {
    return super.clone();
  }
}
  
class Singleton3 extends SuperClass
{
  public static Singleton3 obj = new Singleton3();
  
  private Singleton3() 
  {
  }
}

public class IncaseIOfCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton3 instance1 = Singleton3.obj;
		Singleton3 instance2 = (Singleton3) instance1.clone();
	    System.out.println("instance1 hashCode:- " + instance1.hashCode());
		System.out.println("instance2 hashCode:- " + instance2.hashCode()); 

	}

}
