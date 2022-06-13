package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArrayList {

	public static List<Integer> removeDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> al2 = new ArrayList<>();
		for(Integer i:list) {
			if(!al2.contains(i)) {
				al2.add(i);
			}
		}
		return al2;
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		  removeDuplicate(list);
		  System.out.println(removeDuplicate(list));
	}

}
