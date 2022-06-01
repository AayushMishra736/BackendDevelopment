package com.oops.inheritance;

class SuperSeniorClass{
	void print() {
		System.out.println("SuperSeniorClass class called print method.");
	}
}
class SeniorClass extends SuperSeniorClass{
   void print() {
	   System.out.println("SeniorClass class called print method.");
   }
}
class Junior extends SuperSeniorClass{
	void print() {
		   System.out.println("Junior class called print method.");
	   }
}
public class HybridInheritance extends Junior{
	public static void main(String[] args) {
		SuperSeniorClass sb = new SuperSeniorClass();
		sb.print();
		SeniorClass sc = new SeniorClass();
		sc.print();
		Junior ju = new Junior();
		ju.print();
		HybridInheritance hb = new HybridInheritance();
		hb.print();		
	}
}
