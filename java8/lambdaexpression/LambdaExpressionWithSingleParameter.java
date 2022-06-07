package com.java8.lambdaexpression;

interface MyInterface2{
	public String write(String s);
	
}


public class LambdaExpressionWithSingleParameter {

	public static void main(String[] args) {
		MyInterface2 m1 = (name)->{
			return "Author is writing book," + name;
		};
        System.out.print(m1.write(" the man who knew infinity."));
        
	}

}
