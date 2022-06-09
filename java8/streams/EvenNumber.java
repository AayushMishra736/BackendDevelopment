package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,3,6,9,4,2,78,56,88,80,90,100,101,102);
	List<Integer> finalList = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
    System.out.println(finalList);
	}

}
