package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

/**
 * Problem-10: Can we solve problem-8 using stacks?
 * Solution: 
 * Algo:
 * a) Traverse the list till we encounter X as input element.
 * b) During traversal, push all elems (till X) on to the stack.
 * c) For second half of list, compare each elems content with top of stack.
 *    If they are same, then pop the stack and go to the next elem in the list.
 * d) if they are not same, then given string is not palindrome.
 * e) Continue the process until stack is empty or string is not a palindrome.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n/2) ~ O(n)
 * @author ashi
 *
 */
class Problem010 {

	public boolean isPalindrome(String inputstr) {
		char inputChar[] =inputstr.toCharArray();
		Stack<Character> s = new Stack<Character>();
		int i=0;
		while( inputChar[i] != 'X') {
			s.push(inputChar[i]);
			i++;
		}
		i++;
		while(i<inputChar.length) {
			if(s.isEmpty()) return false;
			if(inputChar[i] != s.pop()) {
				return false;
			}
			i++;
		}
		return true;
	}
}
