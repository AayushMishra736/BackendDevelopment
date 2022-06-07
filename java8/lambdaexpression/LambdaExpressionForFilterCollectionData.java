package com.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import Java8.ProductList;

class Book{
	int id;
	String name;
	float price;
	
	public Book(int id,String name,float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;	
	}
	
}
public class LambdaExpressionForFilterCollectionData {

	public static void main(String[] args) {
		 List<Book> list=new ArrayList<Book>();  
	        list.add(new Book(1,"Samsung A5",17000f));  
	        list.add(new Book(3,"Iphone 6S",65000f));  
	        list.add(new Book(2,"Sony Xperia",25000f));  
	        list.add(new Book(4,"Nokia Lumia",15000f));  
	        list.add(new Book(5,"Redmi4 ",26000f));  
	        list.add(new Book(6,"Lenevo Vibe",19000f));  
	          
	        Stream<Book> filtered_data = list.stream().filter(p -> p.price > 20000);  
	        for(Book pl:list) {
	            System.out.println(pl.id + " " + pl.name + " " +  pl.price);  
	            };  
            

	}

}
