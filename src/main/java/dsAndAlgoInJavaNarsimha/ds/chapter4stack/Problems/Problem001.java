package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

/**
 * Problem-1: Discuss how stacks can be used for balancing of symbols.
 * Solution:
 * Stacks can be used to check whether the given expression has balanced symbols.
 * This algo is very useful in compilers. Each time parser reads one char at a time.
 * If char is an opening delimiter such as (, { or [ then it is written to stack.
 * When a closing delimiter is encountered like ], } or ) the stack is popped.
 * The opening and closing delimiters are then compared. If they match, the 
 * parsing of string continues else parser indicates there is an error on the line.
 * A linear-time O(n) algo based on stack cab be given by:
 * Algorithm:
 * a) Create a stack.
 * b) while (end of input is not reached)
 * 		1) If char read is not a  symbol te be balanced, ignore it.
 * 		2) If char is an opening symbol like (, { or [, push it onto stack.
 * 		3) If it is closing symbol like ), } or ], then if stack is empty report an error.
 * 		   Otherwise, pop the stack.
 * 		4) If symbol is not corresponding opening symbol, report an error.
 * c) At end, if stack is not empty, report an error.
 * 
 * Eg. (A+B) + (C+D) Valid? Yes
 * ((A+B)+(C+D) Valid? No
 *   
 * Time Complexity: O(n) for traversing the string
 * Space Complexity: O(n) for creating stack.
 *  
 * @author ashi
 *
 */
class Problem001 {
public boolean isValidSymbolPattern(String s) {
	Stack<Character> stack = new Stack<Character> ();
	if(s==null || s.length() == 0) {
		return true;
	}
	
	for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)=='}') {
			if(!stack.isEmpty()&& stack.peek()=='{')  {
				stack.pop();
			} else {
				return false;
			}
		} else if(s.charAt(i)==']') {
			if(!stack.isEmpty()&& stack.peek()=='[')  {
				stack.pop();
			} else {
				return false;
			}
		} else if(s.charAt(i)==')') {
			if(!stack.isEmpty()&& stack.peek()=='(')  {
				stack.pop();
			} else {
				return false;
			}
		} else {
			stack.push(s.charAt(i));
		}
	}
	if(stack.isEmpty()) {
		return true;
	}
	return false;
}

public static void main(String[] args) {
	String pattern = "({{[()]}}))";
	Problem001 instance = new Problem001();
	System.out.println(instance.isValidSymbolPattern(pattern));
}
}
