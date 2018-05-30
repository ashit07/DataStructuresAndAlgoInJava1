package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

/**
 * Problem-25: Given an algo for sorting a stack in ascending order. We should not 
 * make any assumptions about how stack is implemented. 
 * 
 * Solution: 
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 * @author ashi
 *
 */
class Problem025 {
Stack<Integer> sortstk(Stack<Integer> stk) {
	Stack<Integer> rstk = new Stack<Integer>();
	while(!stk.isEmpty()) {
		int tmp = stk.pop();
		while(!rstk.isEmpty() && rstk.peek() > tmp) {
			stk.push(rstk.pop());
		}
		rstk.push(tmp);
	}
	return rstk;
}
}
