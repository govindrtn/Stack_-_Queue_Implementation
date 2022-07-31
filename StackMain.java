package com.bridgelabz.stack;

public class StackMain {

	public static void main(String[] args) {

		StackServices<Integer> myStack = new StackServices<Integer>();
		myStack.push(70);
		myStack.push(30);
		myStack.push(56);
		myStack.print();
		
		System.out.println("Stack stack after calling pop method ");
		myStack.pop();
		myStack.print();
		myStack.peak();
		
	}
}
