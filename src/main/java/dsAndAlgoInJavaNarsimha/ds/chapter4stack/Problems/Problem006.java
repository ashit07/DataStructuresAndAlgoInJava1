package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

/**
 * Problem-6: How to design a stack so that getMinimum() should be O(1)?
 * Solution: Take an auxiliary stack that maintains the min of all values in stack.
 * Also, assume that, each elem in stack is less than its below elems. For simplicity,
 * lets call this stack as min stack.
 * 
 * When we pop the main stack, pop min stack too. When we push the main stack,
 * push either the new elem or curr min, whichever is lower. If at any time, if we
 * want to get the min then we just return the top elem from the stack.
 *  
 * Time Complexity: O(1)
 * Space Complexity: O(n) (for min stack). But this algo has much better usage 
 * 					if we rarely get a "new minimum or equal". 
 * @author ashi
 *
 */
class Problem006 {
private Stack<Integer> elementStack = new Stack<Integer>();
private Stack<Integer> minStack = new Stack<Integer>();

public void push(int data) {
	elementStack.push(data);
	if(minStack.isEmpty() || minStack.peek() >= data) {
		minStack.push(data);
	} else {
		minStack.push(minStack.peek());
	}
}
public int pop() {
	if(elementStack.isEmpty()) return Integer.MIN_VALUE;
	minStack.pop();
	return elementStack.pop();
}
public int getMinimum() {
	return minStack.peek();
}
public static void main(String [] args) {
	Problem006 stack = new Problem006();
	stack.push(42);
	stack.push(32);
	stack.push(22);
	stack.push(82);
	stack.push(92);
	stack.push(20);
	stack.push(2);
	stack.push(45);
	stack.push(11);
	stack.push(4);
	System.out.println(stack.getMinimum());
}
}
