package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStream {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(23,4,2,34,78,6,45,90,79,-9,-18,0,25,4);
	list.stream().sorted().forEach(System.out::println);
	System.out.println("-----Print in reverse order---");
	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
