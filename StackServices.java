package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedListService;

public class StackServices <T extends Comparable <T>> {
	
	LinkedListService<T> linkedList = new LinkedListService<T>();
	
	public void push(T data) {
		linkedList.add(data);
	}
	public void print() {
		linkedList.display();
	}
}
