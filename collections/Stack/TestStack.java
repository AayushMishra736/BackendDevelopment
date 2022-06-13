package com.collections.Stack;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
	Stack<Integer> st = new Stack<Integer>();
	st.push(12);
	st.push(78);
	st.push(67);
	st.push(79);
	st.push(45);
	st.push(169);
    Iterator itr = st.iterator();
	while(itr.hasNext()) {
	Object values = itr.next();	
	System.out.println(values);	
	}
	
	}

}
