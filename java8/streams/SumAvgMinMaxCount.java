package com.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SumAvgMinMaxCount {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1, 2,3, 3,4, 4, 5, 6, 7, 8, 9, 10);
    IntSummaryStatistics data = list.stream().mapToInt(x -> x).summaryStatistics();
	System.out.println("Get count, min, max, sum, and the average for numbers :" + data);
	}

}
