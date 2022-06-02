package com.oops.polymorphism;

class bank{
	double getRate()
	{return 0;}
}
class SBI extends bank{
	double getRate() {
		return 4.57;
	}	
}
class ICICI extends bank{
	double getRate() {
		return 5.67;
	}
}
class BOI extends bank{
	double getRate() {
		return 7.27;
	}
}
public class MethodOverriding extends BOI{
	public static void main(String[] args) {
		SBI sb = new SBI();
		System.out.println("SBI rate of interest is " + sb.getRate());
		ICICI ic = new ICICI();
		System.out.println("ICICI rate of interest is " + ic.getRate());
		BOI boi = new BOI();
		System.out.println("BOI rate of interest is " + boi.getRate());
	}
}
