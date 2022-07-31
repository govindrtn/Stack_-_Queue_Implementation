package com.bridgelabz.stack;

public class QueueMain {
	
	public static void main(String[] args) {
		
		QueueServices<Integer> myQueue = new QueueServices<Integer>();
		
		myQueue.enQueue(56);
		myQueue.enQueue(30);
		myQueue.enQueue(70);
		myQueue.print();
		
		myQueue.deQueue();
		myQueue.print();
	}
}
