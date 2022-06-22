package com.exception.TryCatchBlock;

public class MultipleTryCatchTest {

	public static void main(String[] args) {
	try {
	int a[] = new int[5];
	 a[10] = 50;
		
	}
	catch(ArithmeticException e) {
		    System.out.println("Arithmetic Exception Occur");	
		    }
	catch(ArrayIndexOutOfBoundsException e) {
	    System.out.println("Array Index Out Of Bounds Exception");
		}
	catch(Exception e){
		System.out.println("Exception caught.");	
		}
	}
}
