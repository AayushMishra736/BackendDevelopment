package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class countStringWithLengthMoreThanThree {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("asfs","awe4","asdfgds","jhtr","iuytr","uytr","uyt","itr");
	Long wordCount = list.stream().filter(x -> x.length() > 3).count();
    System.out.println(wordCount);
	}

}
