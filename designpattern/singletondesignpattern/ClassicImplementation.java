package com.designpattern.singletondesignpattern;

public class ClassicImplementation {

	private static ClassicImplementation obj;
	
	private ClassicImplementation(){
		
	}
	public static ClassicImplementation getInstance() {
	if(obj == null) 
		obj = new ClassicImplementation();
		return obj;

   }
	 public static void main(String[] args) {
		 ClassicImplementation cs = new ClassicImplementation();
		 System.out.print(cs.getInstance());	 
	 }
	
	
}
