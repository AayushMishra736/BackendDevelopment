package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElementOFTheList {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("mango","apple","banana","grapes","orange");
	String value = list.stream().findFirst().orElse(null);
	System.out.println("-----Using String----");
	System.out.println(value);
	Optional<String> result = list.stream().findFirst();
	System.out.println("-----Using Optional----");
	System.out.println(result);
	}

}
