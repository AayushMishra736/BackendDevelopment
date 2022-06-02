package com.oops.exceptioninpolymorphism;

class ParentClass1{
	void testMethod() {
		System.out.println("No exception in parent class.");
	}
}

public class ParentNoExceptionChildClassUnchekcedException extends ParentClass1 {
   @Override
   void testMethod() throws ArithmeticException{
	   throw new ArithmeticException("Arithematic Exception");
   }
	
	public static void main(String[] args) {
		ParentClass1 pc1 = new ParentNoExceptionChildClassUnchekcedException();
		pc1.testMethod();		

	}

}
