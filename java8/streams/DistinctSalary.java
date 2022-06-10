package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSalary {

	public static void main(String[] args) {
	List<Float> list = new ArrayList<>();
	list.add(60000f);
	list.add(56000f);
	list.add(56000f);
	list.add(58000f);
	list.add(66000f);
	list.add(66000f);
	list.add(62000f);
	List<Float> finalSalary = list.stream().distinct().collect(Collectors.toList());
	System.out.println(finalSalary);
	}
}
