package com.MyNode;

public class MyStack {
	public final MyLinkedList myLinkedList;

	/**
	 * Constructor
	 */
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	/**
	 * Push to stack(UC1)
	 * @param myNode
	 * @return
	 */
	public boolean push(INode myNode) {
		myLinkedList.add(myNode);
		return true;
	}
	
	/**
	 * Peek UC2
	 * @return
	 */
	public INode peak() {
		return myLinkedList.head;
	}
	public INode pop() {
		return myLinkedList.pop();
	}
	public void printMyStack() {
		myLinkedList.printMyNode();
	}

}
