package com.designpattern.singletondesignpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton2 implements Serializable{
	
	public static Singleton2 obj = new Singleton2();
	
	private Singleton2() {}
	
}

public class InCaseOfSerialization {

	public static void main(String[] args) {
	try {
		Singleton2 instance1 = Singleton2.obj;
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
		Singleton2 instance2 = (Singleton2) in.readObject();
		in.close();
		
		 System.out.println("instance1 hashCode:- " + instance1.hashCode());
         System.out.println("instance2 hashCode:- "  + instance2.hashCode());
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}

	}

}
