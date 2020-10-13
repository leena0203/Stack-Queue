package com.MyNode;

public class MyLinkedList<K extends Comparable<K>> {
	public INode head;
	public INode tail;

	/**
	 * Constructor
	 */
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * add at top(UC2)
	 * @param newNode
	 */
	public void add (INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}
	}

	/**
	 * add from end(UC3)
	 * @param newNode
	 */
	public void append(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/**
	 * insert in between(UC4)
	 * @param myNode
	 * @param newNode
	 */
	public void insert(INode myNode,INode newNode) {
		INode tempNode = myNode.getNext() ;
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	/**
	 * Delete element from top(UC5)
	 * @return
	 */
	public INode pop() {
		INode tempNode = head ;
		this.head = head.getNext();
		return tempNode;
	}  

	/**
	 * Delete element from end(UC6)
	 * @return
	 */
	public INode popLast() {
		INode tempNode = head ;
		while(! tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		//tempNode.setNext(null);
		return tempNode;
	}

	/**
	 * Search element(UC7)
	 * @param key
	 * @return
	 */
	public INode search(K key ) {
		INode tempNode = head ;
		while (tempNode != null && tempNode.getNext() != null) {
			if(tempNode.getKey().equals(key))
				break;
			tempNode =tempNode.getNext();
		}
		return tempNode;
	}

	/**
	 * Add between specific element(UC8)
	 * @param key
	 * @param newNode
	 */
	public void addInBetweenSearch(K key, INode newNode) {
		INode tempINode = search(key);
		newNode.setNext(tempINode.getNext());
		tempINode.setNext(newNode);
	}

	/**
	 * Delete the specific key (UC9)
	 * @param key
	 * @return
	 */
	public int delete(K key) {
		INode tempNode = head;
		INode previous = head;
		if (head.getKey().equals(key))
			head = head.getNext();
		else if (tail.getKey().equals(key)) {
			popLast();
		}
		else {
			while (tempNode != null && tempNode.getNext() != null) {
				if(tempNode.getKey().equals(key))
					break;
				previous = tempNode;
				tempNode = tempNode.getNext();
			}
			previous.setNext(tempNode.getNext());
		}
		return size();
	}

	/**
	 * size of list (UC9)
	 * @return
	 */

	public int size() {
		int size = 0;
		INode node = head;
		while(node.getNext() != null) {
			size++;
			node = node.getNext();
		}
		if(node.equals(tail)) {
			size++;
		}
		return size;
	}
	
	public boolean orderedLinkedList(INode newNode) {
		INode tempNode = head;
		if (head == null) { // if linked list is empty then setting new node as head and tail
			head = newNode;
			tail = newNode;
		} else if (((Comparable<K>) head.getKey()).compareTo((K) newNode.getKey()) > 0) { // if new node is less than head then setting new
																	// node head
			newNode.setNext(tempNode);
			head = newNode;
		} else if (((Comparable<K>) tail.getKey()).compareTo((K) newNode.getKey()) < 0) { // if new node is more than tail then setting new
																	// node tail
			tail.setNext(newNode);
			tail = newNode;
		} else {
			INode previous = head;
			while (tempNode.getNext() != null && ((Comparable<K>) tempNode.getKey()).compareTo((K) newNode.getKey()) < 0) {
				previous = tempNode;
				tempNode = tempNode.getNext();
			}
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);
		}
		return true;
	}

	/**
	 * Print
	 */
	public void printMyNode() {
		StringBuffer print = new StringBuffer(" Node: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			print.append(tempNode.getKey());
			if(! tempNode.equals(tail)) print.append("->");
			tempNode = tempNode.getNext();
		}
		print.append(tempNode.getKey());
		System.out.println(print);
	}
}

