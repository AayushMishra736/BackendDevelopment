package com.designpattern.singletondesignpattern;

public class DoubleCheckedLocking {

	private static volatile DoubleCheckedLocking obj = null;
	
	private DoubleCheckedLocking() {}
	
	public static DoubleCheckedLocking getInstance() {
		if(obj == null) {
			synchronized (DoubleCheckedLocking.class) {
				if(obj == null)
				{
					obj = new DoubleCheckedLocking();
					
					
				}
				
				
			}
			
			
		}
		return obj;
		
		
	}
	
	
	
}
