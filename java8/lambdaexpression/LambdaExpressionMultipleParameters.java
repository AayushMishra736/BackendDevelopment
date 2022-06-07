package com.java8.lambdaexpression;

interface MyInterface3 {
	int avg(int a,int b);
}


public class LambdaExpressionMultipleParameters {

	public static void main(String[] args) {
		MyInterface3 m = (a,b) -> {
			return (a + b)/2;
		};
        System.out.println("Average of two term is : " + m.avg(10,45));
	}

}
