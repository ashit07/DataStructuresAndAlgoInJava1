package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.Problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Problem-8: Given a stack of integers, how do you check whether each successive 
 * pair of numbers in the stack is consecutive or not. The pairs can be increasing
 * or decreasing and if the stack has an odd number of elems, the elem at the top 
 * is left out of a pair. For example, if the stack of elems are 
 * [4,5,-2,-3,11,10,5,6,20] then the output shld be true becoz each of these
 * pairs (4,5) (-2,-3) (11,10) (5,6) consists of consecutive numbs. 
 * @author ashi
 *
 */
class Problem008 {
	public boolean checkStackPairwiseorder(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean pairedOtherwise = true;
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		while(!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
			if(!s.isEmpty()) {
				int m = s.pop();
				if(Math.abs(n-m) !=1) {
					pairedOtherwise = false;
					break;
				}
			}
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		return pairedOtherwise;
	}
}
