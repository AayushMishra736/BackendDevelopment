package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddStringInListWithMoreThanTwoCharacters {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("asfs","awe4","es","jhtr","iuytr","uytr","ae","itr","rt");
		List<String> finalList = list.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.println(finalList);
	}

}
