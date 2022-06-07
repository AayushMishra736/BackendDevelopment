package com.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ProductList{
	int id;
	String name;
	float price;
	
	public ProductList(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;	
	}
}

public class LambdaExpressionForComparator {

	public static void main(String[] args) {
            List<ProductList> list = new ArrayList<ProductList>();  
	        list.add(new ProductList(1,"HP Laptop",25000f));  
	        list.add(new ProductList(3,"Keyboard",300f));  
	        list.add(new ProductList(2,"Dell Mouse",150f));  
	      
	 System.out.println("Sorting on the basis of name....");    
	 
	 Collections.sort(list,(p1,p2) ->{
     return p1.name.compareTo(p2.name);	 
	 });
	 
	 for(ProductList p: list) {
		  System.out.println(p.id+" "+p.name+" "+p.price);  	 
	 }
	 
	}

}






