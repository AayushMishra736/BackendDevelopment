package com.oops.Interface;

interface MyData{
	default void print(String str) {
		if(!isNull(str)) {
			System.out.println("My Data Print.." + str);
		}
	}
	static boolean isNull(String str) {
		boolean isNull = false;
		System.out.println("Interface Null Check..");
		return str == null ? true :"".equals(str)?true:false;
	}
	
}
public class StaticMethodInInterface implements MyData{

	public boolean isNull(String str) {
		System.out.println("Sub Class Null Check..");
		return str == null ? true : false;
	}
	
	public static void main(String[] args) {
		StaticMethodInInterface obj = new StaticMethodInInterface();
		obj.print(" ");
        obj.isNull("abc");
	}

}
