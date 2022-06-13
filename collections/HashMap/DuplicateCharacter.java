package com.collections.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.management.ValueExp;

public class DuplicateCharacter {
	
	private static void findduplicate(String s) {
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	for(int i = 0;i < s.length();i++) {
		if(!hm.containsKey(s.charAt(i))) {
			hm.put(s.charAt(i),1);
		}
		else {
			hm.put(s.charAt(i),hm.get(s.charAt(i)) + 1);
		}	
		
	}
	for(Map.Entry MapElement : hm.entrySet()) {
	int value = (int) MapElement.getValue();	
	char key = (char) MapElement.getKey();
	
	if(value > 1) {
	System.out.println(key + " " + value);
	}
		
	}
		
		
	}
	public static void main(String[] args) {
	String s = "asdfghdszfgfhnfdsadfvs";
	findduplicate(s);
	}
}
