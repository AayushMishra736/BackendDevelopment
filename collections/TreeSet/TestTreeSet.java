package com.collections.TreeSet;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		 ts.add("A");
	     ts.add("B");
	     ts.add("C");
	     ts.add("D");
	     ts.add("E");
	     ts.add("F");
	     System.out.println("Initial TreeSet " + ts);
		 ts.remove("B");
		 System.out.println("TreeSet after removal " + ts);
		 ts.pollFirst();
		 System.out.println("TreeSet after pollFirst " + ts);
		 ts.pollLast();
		 System.out.println("TreeSet after pollLast " + ts);
		 
	}

}
