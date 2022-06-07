package com.java8.lambdaexpression;

interface MyInterface1{
	
	public String read();
}


public class LambdaExpressionWithNoParameter {

	public static void main(String[] args) {
		MyInterface1 my = ()->{
			return "Hi this is read receipt of my interface!";
		};
		System.out.print(my.read());

	}

}
