package com.collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
	Vector<String> v = new Vector<String>();
    v.add("America");
    v.add("Asia");
    v.add("Africa");
    v.add("Australia");
    Enumeration er = v.elements();
    while(er.hasMoreElements())
    {
     System.out.println(er.nextElement());	 
    }
    
	}

}
