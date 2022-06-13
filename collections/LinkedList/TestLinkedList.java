package com.collections.LinkedList;

import java.util.LinkedList;

public abstract class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linklist = new LinkedList<String>();
		linklist.add("A");
		linklist.add("B");
		linklist.addLast("E");
		linklist.addFirst("C");
		linklist.add(2,"D");
		System.out.println("Intial Linked List " + linklist);
		linklist.remove("B");
		linklist.remove(3);
		linklist.removeFirst();
		linklist.removeLast();
		System.out.println("Linked List After Removal " + linklist);
	}
}
