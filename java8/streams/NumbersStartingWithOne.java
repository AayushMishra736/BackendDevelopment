package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {
	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(123432,5434,5434,1234,134,54324,6546,123456);	
	List<String> finalList = list.stream().map(y -> y.toString()).filter(x -> x.startsWith("1")).collect(Collectors.toList());
	System.out.println("After converting it into String......");
	System.out.println(finalList);	
	}
}
