package com.oops.exceptioninpolymorphism;


class ParentClass4{
	public void testMethod() throws ArithmeticException{
		throw new ArithmeticException("Arithmetic Exception");
	}
}

public class ParentUnchekcedExceptionChildUnchecked extends ParentClass4{
	public void testMethod() throws NullPointerException{
		throw new NullPointerException("NullPointer Exception");
	}
	public static void main(String[] args) {
		ParentClass4 obj = new ParentUnchekcedExceptionChildUnchecked();
		try{
			obj.testMethod();
		}
	    catch(Exception e) {
	    e.printStackTrace();	
	    }
	}

}
