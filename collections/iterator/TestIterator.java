package com.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(100);
    al.add(200);
    al.add(400);
    al.add(550);
    al.add(500);
    
    Iterator itr = al.iterator();
    System.out.println("List elements : ");
    while(itr.hasNext()) {
    System.out.println(itr.next());	
    }
	}

}
