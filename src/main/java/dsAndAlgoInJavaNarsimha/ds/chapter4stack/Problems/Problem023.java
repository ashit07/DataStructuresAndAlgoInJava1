package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.Stack;

/**
 * Problem-23: Can we improve the complexity of problem-22?
 * Solution: From problem-22, we see that span S[i] on day i can be easily
 * calculated if we know the closest day preceding i, such that price is
 * greater than on that day than the price on day i. Let us call such day as P.
 * If such a day exists, then the span is now defined as S[i]=i-P.
 * 
 * Time Complexity: Each of the index of arr is pushed into stack exactly once and
 *    also popped from stack at most once. The statements in while loop are
 *    executed at most n times. Even though the algo has nested loops, the 
 *    complexity is O(n) as the inner loop is executing n times during course 
 *    of algo.
 * Space Complexity: O(n) (for stack). 
 * @author ashi
 *
 */
class Problem023 {
 int [] findingSpans(int[] inputArray) {
	int[] spans = new int[inputArray.length];
	Stack<Integer> st = new Stack<Integer>();
	int p=0;
	for(int i=0;i<inputArray.length; i++) {
		while(!st.isEmpty() && inputArray[i]> inputArray[st.pop()]) {
			st.pop();
		}
		if(st.isEmpty()) {
			p=-1;
		} else {
			p=st.pop();
		}
		spans[i] = i-p;
		st.push(i);
	}
	return spans;
 }
}
