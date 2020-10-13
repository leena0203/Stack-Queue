package com.MyNode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	void given3NumbersWhenAddedToLinkesListShouldBeAddedToTop() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.add(secondElement);
		test.add(thirdElement);
		test.printMyNode();
		boolean result = test.head.equals(thirdElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(firstElement);				
		assertEquals(true, result);
	}

	@Test
	void given3NumbersWhenAddedToLinkesListShouldBeAddedToEndd() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		test.printMyNode();
		boolean result = test.head.equals(firstElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(thirdElement);				
		assertEquals(true, result);
	}		
	@Test
	void given3NumbersInsertBetweenTwoNumbers() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(thirdElement);
		test.insert(firstElement, secondElement);
		test.printMyNode();
		boolean result = test.head.equals(firstElement) &&
				test.head.getNext().equals(secondElement) &&
				test.tail.equals(thirdElement);				
		assertEquals(true, result);
	}

	@Test
	void methodToPopAtFirstNode() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		assertEquals(firstElement, test.pop());
		test.printMyNode();
	}
	
	@Test
	void methodToPopAtLastNode() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		assertEquals(thirdElement, test.popLast());
		test.printMyNode();
	}
	
	@Test
	void methodToSearchLinkedListToFindNode() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(thirdElement);
		assertEquals(secondElement, test.search(30));
		test.printMyNode();
	}
	

	@Test
	void methodToInsertANodeAfterSearchNode() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(40);
		MyNode<Integer> fourthElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(fourthElement);
		test.addInBetweenSearch(30, thirdElement);
		test.printMyNode();
		boolean result = test.head.equals(firstElement) &&
				test.head.getNext().equals(secondElement) &&
				test.head.getNext().getNext().equals(thirdElement) &&
				test.tail.equals(fourthElement);				
		assertEquals(true, result);
	}
	
	@Test
	void methodToDeletANodeAndReturnCount() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(40);
		MyNode<Integer> fourthElement = new MyNode<>(70);
		MyLinkedList test = new MyLinkedList();
		test.add(firstElement);
		test.append(secondElement);
		test.append(fourthElement);
		test.addInBetweenSearch(30, thirdElement);
		test.printMyNode();
		int size = test.delete(40);
		test.printMyNode();
		assertEquals(3,size);
	}
	
	@Test
	void methodToOrderLinkedList() {
		MyNode<Integer> firstElement = new MyNode<>(56);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(40);
		MyNode<Integer> fourthElement = new MyNode<>(70);
		MyNode<Integer> fifthElement = new MyNode<>(20);
		MyLinkedList test = new MyLinkedList();
		assertTrue(test.orderedLinkedList(firstElement));
		assertTrue(test.orderedLinkedList(secondElement));
		assertTrue(test.orderedLinkedList(thirdElement));
		assertTrue(test.orderedLinkedList(fifthElement));
		assertTrue(test.orderedLinkedList(fourthElement));
		test.printMyNode();
	}
}



