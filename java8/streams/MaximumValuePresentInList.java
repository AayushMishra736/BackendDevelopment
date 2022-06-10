package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MaximumValuePresentInList {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
        values.add(34);
        values.add(56);
        values.add(78);
        values.add(23);
        values.add(89);
        values.add(67);
        values.add(79);
        values.add(90);
        values.add(100);
        values.add(345);
        values.add(35);
        Optional<Integer> opt = values.stream().max((i,j) -> i.compareTo(j));
        System.out.println(opt.get());
	}
}
