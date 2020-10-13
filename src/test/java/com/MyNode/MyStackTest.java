package com.MyNode;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStackTest {
	/**
	 * UC1 check test to add elements in stack from top
	 */
	@Test
	void given3NumbersWhenAddedToStackShouldBeAddedToTop() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyStack test = new MyStack();
		assertTrue(test.push(firstElement));
		assertTrue(test.push(secondElement));
		assertTrue(test.push(thirdElement));
		test.printMyStack();
	}

	/**
	 * UC2 Return top element when peek
	 */
	@Test
	void given3NumbersWhenPeekShoulReturnTopNode() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyStack test = new MyStack();
		test.push(firstElement);
		test.push(secondElement);
		test.push(thirdElement);
		test.printMyStack();
		INode<Integer> peak = test.peak();
		assertEquals(thirdElement,peak);

	}
	
	/**
	 * Pop Stack
	 */
	@Test
	void given3NumbersWhenPopShoulReturnLastNode() {
		MyNode<Integer> firstElement = new MyNode<>(70);
		MyNode<Integer> secondElement = new MyNode<>(30);
		MyNode<Integer> thirdElement = new MyNode<>(56);
		MyStack test = new MyStack();
		test.push(firstElement);
		test.push(secondElement);
		test.push(thirdElement);
		test.printMyStack();
		INode<Integer> pop = test.pop();
		assertEquals(thirdElement,pop);
		test.printMyStack();
	}


}
