package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStringFromArray {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("asfs","awe4","","jhtr","iuytr","uytr","","itr");
		List<String> finaList = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(finaList);
	}
}
