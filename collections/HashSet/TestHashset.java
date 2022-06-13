package com.collections.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashset {

	public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	hs.add("India");  
	hs.add("America");  
	hs.add("Russia");  
	hs.add("China");  
	hs.add("India");                    
	hs.add("Russia");  
	Iterator<String> it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
