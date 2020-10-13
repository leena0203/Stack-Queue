package com.MyNode;

public class MyStack {
	public final MyLinkedList myLinkedList;
	
	/**
	 * Constructor
	 */
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public boolean push(INode myNode) {
		myLinkedList.add(myNode);
		return true;
	}

	public void printMyStack() {
		myLinkedList.printMyNode();
	}

}
