package com.oops.exceptioninabstraction;

import java.io.IOException;

interface Myinterface1{
	abstract void display() throws IOException;
}


public class AbstractionSuperClassThrowingExceptionChildSame implements Myinterface1 {
   @Override
   public void display() throws IOException{
		throw new IOException("IO Exception");
   };
	
	public static void main(String[] args) {
		Myinterface1 intface = new AbstractionSuperClassThrowingExceptionChildSame();
		try{
			intface.display();
		}
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
