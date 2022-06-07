package com.java8.lambdaexpression;

import java.util.ArrayList;

public class LambdaExpressionForEachLoop {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	 list.add("Mango");  
     list.add("Banana");  
     list.add("Apple");  
     list.add("Grapes"); 
     list.add("Watermelon");
     list.add("Orange");
     list.forEach((ls)-> System.out.println(ls));
	}
}
