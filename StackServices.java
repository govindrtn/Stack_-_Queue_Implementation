package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedListService;

public class StackServices<T extends Comparable<T>> {

	LinkedListService<T> linkedList = new LinkedListService<T>();

	public void push(T data) {
		linkedList.add(data);
	}

	public void pop() {
		linkedList.pop();
	}

	public void peak() {
		System.out.println("Top element in linkedLit " + linkedList.head.data);
	}

	public void print() {
		linkedList.display();
	}

}
