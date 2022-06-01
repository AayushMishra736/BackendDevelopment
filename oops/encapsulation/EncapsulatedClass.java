package com.oops.encapsulation;

class Encapsulate{
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}


public class EncapsulatedClass {

	public static void main(String[] args) {
		Encapsulate es = new Encapsulate();
		es.setId(101);
		es.setName("Abhay");
		es.setCity("Bhopal");
		System.out.println("Id :" + es.getId() + " ,Name : " + es.getName() + " ,City : " + es.getCity());

	}

}
