package com.exception.ThrowAndThrows;

import java.util.Scanner;

public class ThrowingUncheckedException {

	public static void validate(int age) {
	if(age < 18) {
		throw new ArithmeticException("Age Is Invalid To Vote.");
	}
	else {
		System.out.println("Person Is Eligible To Vote.");
	}
	}
	
	public static void main(String[] args) {
	System.out.println("Enter the age of candidate :");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
    validate(age);
	}

}
