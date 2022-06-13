package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Dhanbad");
		list.add(0, "New York");
		list.add("Mumbai");
		list.add(3, "Sydney");
		System.out.println("Initial List :" + list);
		ArrayList<String> al = new ArrayList<String>();
		al.add("Jabalpur");
		al.add("Bhopal");
		System.out.println("Second List :" + al);
		list.addAll(al);
		System.out.println("List After Adding another list :" + list);
		System.out.println("Check wheather list is empty or not :" + list.isEmpty());
		System.out.println("Check wheather element is present or not :" + list.contains("Mumbai"));
		System.out.println("Check the position of element :" + list.indexOf("Mumbai"));
		System.out.println("-----------------Convert an arraylist to array-------------");
		Object[] arrays = list.toArray();
		for (Object object : arrays) {
			System.out.print(object);
		}
		System.out.println("\nGetting element at index 3 :" + list.get(3));
		list.set(4, "Indore");
		System.out.println("List after replacing element :" + list);
		list.remove(2);
		System.out.println("Removing an element from position :" + list);
		Collections.sort(list);
		System.out.println("ArrayList after sorting elements " + list );
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("ArrayList after sorting in reverse order " + list );
	}

}
