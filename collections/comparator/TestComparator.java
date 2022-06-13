package com.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int id;
    String name;
    int age;
    Student(int id,String name,int age){
    this.id = id;
    this.name = name;
    this.age = age;
    }
}

class AgeComparator implements Comparator<Student>
{
public int compare(Student s1,Student s2) {
if(s1.age == s2.age)
	return 0;
else
	if(s1.age > s2.age)
		return 1;
	else
		return -1;	
}
}

class NameComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
	return s1.name.compareTo(s2.name);		
	}
}

public class TestComparator {
	public static void main(String[] args) {	
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  		
		System.out.println("Sorting By Name ");
		Collections.sort(al,new NameComparator());
		for(Student st:al) {
			System.out.println(st.id + " "  + st.age + " " + st.name);
		}
		System.out.println("Sorting By Age ");
		Collections.sort(al,new AgeComparator());
		for(Student st:al) {
			System.out.println(st.id + " "  + st.age + " " + st.name);
		}
	}

}


