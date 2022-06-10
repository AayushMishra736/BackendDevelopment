package com.java8.streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatativeCharacter {

	private static Character logic(String input) {  
	Character result = input.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))).
			collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
			.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().get();

	
        
         return result;    
  }
	public static void main(String[] args) {
	String s = "auyissnwqejoccdmcmddd";
	System.out.println(logic(s));
	}

}
