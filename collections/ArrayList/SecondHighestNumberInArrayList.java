package com.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumberInArrayList {

	public static int findDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(Integer i:list) {
			if(!al.contains(i)) {
				al.add(i);
			}			
		}
	  Collections.sort(al);
		return al.get(al.size() - 2);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		int i = findDuplicate(list);  
		System.out.print(i);
	}

}
