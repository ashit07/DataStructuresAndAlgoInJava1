package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

/**
 * Problem-4: Discuss postfix evaluation using stacks
 * Solution:
 * Algorithm:
 * 1. Scan the Postfix string from left to right
 * 2. Create an empty stack.
 * 3. Repeat steps 4 and 5 till all characters are scanned.
 * 4. If scanned character is an operand, push it onto stack.
 * 5. If scanned character is an operator, and if the operator is unary operator 
 * 	  then pop an element from stack. If operator is binary operator then pop
 * 	  two elements from the stack. After popping the elements, apply the 
 *    operator to those popped elements. Let the result of this operation be
 *    retVal onto the stack.
 * 6. After all elements are scanned, we will have only one element in stack.
 * 7. Return top of the stack as result.
 * 
 * @author ashi
 *
 */
class Problem004 {
	public int expressionEvaluation(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for(String token : tokens){
			if(token.equals("+")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2+op1);
			} else if(token.equals("-")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2-op1);
			} else if(token.equals("*")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2*op1);
			} else if(token.equals("/")) {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2/op1);
			} else {
				stack.push(Integer.parseInt(token));
			}
			
		}
		return stack.pop();
	}
	
	public static void main(String args[]) {
		String [] tokens = {"1", "2", "3", "*", "+", "5", "-"};
		System.out.println(new Problem004().expressionEvaluation(tokens));
	}
}
