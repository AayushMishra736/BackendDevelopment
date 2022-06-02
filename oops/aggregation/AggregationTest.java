package com.oops.aggregation;

class Operation{
	int square(int r) {
		return r*r;
	}
}


public class AggregationTest {
	
	Operation op;
	double area(int radius) {
		double pi = 3.14;
		op = new Operation();
		double res;
		res = pi * op.square(radius);
		return res;
	}
	public static void main(String[] args) {
		AggregationTest at = new AggregationTest();
		double area = at.area(25);
		System.out.print("Area of circle is : " + area);
	}

}
