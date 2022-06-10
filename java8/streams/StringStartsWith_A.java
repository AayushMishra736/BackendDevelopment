package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartsWith_A {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("sadf","asdfg","sadf","qwerty","asdfgh","sadfge","asd","edr");
    List<String> finaList = list.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
    System.out.println(finaList);
	}
}
