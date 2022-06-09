package com.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {

	public static <T> Set<T> findDuplicate(Stream<T> stream) {
    Set<T> set = new HashSet<>();	
    return stream.filter(x -> !set.add(x)).collect(Collectors.toSet());
	}
	
	
	public static void main(String[] args) {
	Stream<Integer> stream = Stream.of(1,2,4,5,1,2,6,8,9,10,4,5);
	System.out.println(findDuplicate(stream));
	}
	
}
