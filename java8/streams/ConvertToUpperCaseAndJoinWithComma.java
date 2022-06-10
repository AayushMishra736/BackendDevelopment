package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCaseAndJoinWithComma {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("w", "e", "e", "k", "d","a","y","s");
	String upper = list.stream().map(String::toUpperCase).collect(Collectors.joining(","));
    System.out.println(upper);
	}

}
