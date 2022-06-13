package com.collections.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String[] args) {
	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();      
	map.put(101,"Chicago");
	map.put(102,"Canada");
	map.put(103,"America");
	map.put(104,"England");
	map.put(105,"Asia");
	map.put(106,"Africa");
	map.put(107,"Egypt");	
	for(Map.Entry mapelement : map.entrySet()) {
	System.out.println(mapelement.getKey() + " " + mapelement.getValue());		
	}
	
	}
}
