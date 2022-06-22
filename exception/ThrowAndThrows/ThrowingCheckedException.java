package com.exception.ThrowAndThrows;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowingCheckedException {

	public static void method() throws FileNotFoundException{
	FileReader file = new FileReader("C:\\Users\\aayus\\OneDrive\\Desktop\\hcl exercies\\application.txt");
	BufferedReader fileInput = new BufferedReader(file);
	}
	
	
	public static void main(String[] args){
	try {
		method();	
	}
	catch(FileNotFoundException e) {
	e.printStackTrace();
	}
		
	}

}
