package com.collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
	TreeMap<Integer,String> map = new TreeMap<Integer,String>();
	map.put(101,"Chicago");
	map.put(102,"Canada");
	map.put(103,"America");
	map.put(104,"England");
	map.put(105,"Asia");
	map.put(106,"Africa");
	map.put(107,"Egypt");	
	System.out.println("List by TreeMap : ");
	for(Map.Entry MapElement: map.entrySet()) {
	System.out.println(MapElement.getKey() + " " + MapElement.getValue());	
	}
	map.remove(103);
	System.out.println("After Removal : " + map);
    System.out.println("descendingMap: "+ map.descendingMap());  
    System.out.println("headMap: "+ map.headMap(102,true));  
    System.out.println("tailMap: "+ map.tailMap(102,true));   
    System.out.println("subMap: "+ map.subMap(100,false,102,true));   
	
	}
}
