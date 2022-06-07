package com.java8.lambdaexpression;

interface MyInterface4{
	
	int sum(int a,int b);
	
}

public class LambdaExpressionWithOrWithoutReturnType {

	public static void main(String[] args) {
    
		MyInterface4 me = (a,b) -> {
			return (a + b);
		};
		System.out.println(me.sum(23, 47));
		
		MyInterface4 me2 = (a,b) ->(a + b);
		System.out.println(me2.sum(76,45));
		
	}

}
