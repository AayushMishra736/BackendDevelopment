package com.java8.lambdaexpression;

interface MyInterface5{
	String say(String message);
}


public class LambdaExpressionForMultipleStatement {

	public static void main(String[] args) {
		MyInterface5 my5 = (message) -> {
		String str1 = "Time is precious, ";
		String str2 = "Donot waste it.";
		return message + str1 + str2 ;			
		};

	System.out.print(my5.say("Thought:- \n"));	
		
	}
}
