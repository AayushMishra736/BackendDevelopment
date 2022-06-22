package com.exception.TryCatchBlock;

public class NestedTryBlock {

	public static void main(String[] args) {
		try {
			try {
				try {
				int c = 50/0;	
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array Index Of Bound Exception.");
				}
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exeception Caught Main Block.");		
			}	
		}
         catch(Exception e){
        System.out.println("Exeception Caught Main Block.");	 
         }
	}

}
