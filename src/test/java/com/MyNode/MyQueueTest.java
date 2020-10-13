package com.MyNode;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyQueueTest {


	/**
	 * UC3 check test to add elements in stack from top
	 */
	@Test
	void given3NumbersWhenAddedToQueueShouldBeAddedfromEnd() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyQueue test = new MyQueue();
		assertTrue(test.enqueu(firstElement));
		assertTrue(test.enqueu(secondElement));
		assertTrue(test.enqueu(thirdElement));
		test.printQueue();
	}


}
