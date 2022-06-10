package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class countEmptyString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sadf","asdfg","sadf","","","sadfge");
		Long countEmpty = list.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Count of Empty String is " + countEmpty);
	}

}
