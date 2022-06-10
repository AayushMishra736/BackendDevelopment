package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfElementPresent {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(123432,5434,5434,1234,134,54324,6546,123456);
	long number =  list.stream().count();
	System.out.println(number);
	
	
	
	
	}

}
