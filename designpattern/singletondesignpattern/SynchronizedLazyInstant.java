package com.designpattern.singletondesignpattern;

public class SynchronizedLazyInstant {
 
	private static SynchronizedLazyInstant obj;
	
	private SynchronizedLazyInstant() {}
	
	public static synchronized SynchronizedLazyInstant getInstance() {
		if(obj == null)
			obj = new SynchronizedLazyInstant();
		return obj;
	}
	 public static void main(String[] args) {
		 SynchronizedLazyInstant sc= new SynchronizedLazyInstant();
		 System.out.println(sc.getInstance());
		 
	 }
	
}