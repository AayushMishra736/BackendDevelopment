package com.designpattern.factorypattern;

import java.util.Scanner;

interface Currency {
	String getSymbol();
}

class Rupees implements Currency {
	public String getSymbol() {
		return "rs";
	}
}

class Ruble implements Currency {
	public String getSymbol() {
		return "ruble";
	}
}

class Dinar implements Currency {
	public String getSymbol() {
		return "dinar";
	}
}

class CurrencyFactory
{

	public static Currency createCurrency(String str) {
if(str.equalsIgnoreCase("India")) {
	return new Rupees();
}
else
	if(str.equalsIgnoreCase("Russia")) {
	return new Ruble();
}	
	else
		if(str.equalsIgnoreCase("Kuwait")) {
	return new Dinar();
}	

throw new  IllegalArgumentException("Illegal Argument Exception");
    }
}

public class Factory {
	public static void main(String[] args) {
		System.out.println("Specify Country Name : ");
		Scanner sc = new Scanner(System.in);
		String country = sc.nextLine();
		Currency rupee = CurrencyFactory.createCurrency(country);
		System.out.println(rupee.getSymbol());
	}

}
