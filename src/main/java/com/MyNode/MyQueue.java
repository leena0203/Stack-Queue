package com.MyNode;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	/**
	 * Constructor
	 */
	public MyQueue() {
		myLinkedList = new MyLinkedList<>();
	}

	/**
	 * UC3 add element to queue from end
	 * @param element
	 */
	public boolean enqueu(INode element) {
		myLinkedList.append(element);
		return true;
	}
	
	/**
	 * UC4 Dequeue to remove first element
	 * @return
	 */
	public INode dequeue() {
		return myLinkedList.pop();
	}
	
	/**
	 * PrintQueue
	 */
	public void printQueue() {
		myLinkedList.printMyNode();
	}
	

}
