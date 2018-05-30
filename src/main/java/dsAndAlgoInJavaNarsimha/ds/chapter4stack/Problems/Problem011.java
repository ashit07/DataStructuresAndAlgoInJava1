package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

/**
 * Problem-11: Given a stack how to reverse the contents of stack using only 
 * stack operations(push and pop)?
 * Solution: 
 * Algo: a) First pop all elems of stack till it becomes empty.
 * b) For each upward step in recursion, insert the elem at bottom of stack.
 * 
 * @author ashi
 *
 */
 class Problem011 {
public static void reverseStack(Stack<Integer> stack) {
	if(stack.isEmpty()) return;
	int temp = stack.pop();
	reverseStack(stack);
	insertAtBottom(stack, temp);
}

private static void insertAtBottom(Stack<Integer> stack, int data) {
	if(stack.isEmpty()) {
		stack.push(data);
		return;
	}
	int temp = stack.pop();
	insertAtBottom(stack, temp);
	stack.push(temp);
}

public static void main(String[] args) {
	Stack<Integer> stack = new Stack();
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
	
	Utility.displayStackElems(stack);
	Problem011.reverseStack(stack);
	Utility.displayStackElems(stack);
	
}
}
