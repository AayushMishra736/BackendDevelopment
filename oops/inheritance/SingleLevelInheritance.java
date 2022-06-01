package com.oops.inheritance;

class Bus{
	private int speed;
	Bus() {
		System.out.println("Car Started.");
	};
	public void setSpeed(int speed) {
		System.out.println("Car is running at the speed " + speed); 
	}
	public void accelerateCar() {
		System.out.println("Car is accelerating. "); 
	}
	public int getSpeed() {
	return speed;			
	}
	
}
class Tata extends Bus{
   public void color() {
	   System.out.println("The color of car is black.");
   }
   
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		Tata ta = new Tata();
		ta.accelerateCar();
		ta.setSpeed(60);
		ta.color();

	}

}
