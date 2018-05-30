package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.Problems;

import java.util.Queue;
import java.util.Stack;

/**
 * Problem-10: Given an integer k and a queue of integers, how do you reverse the
 * order of first k elems of queue, leaving the other elems in the same relative 
 * order. For example, if k==4 and queue has the elems 
 * [10,20,30,40,50,60,70,80,90]; the output shld be 
 * [40,30,20,10,50,60,70,80,90].
 * 
 * Solution: 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 *
 */
class Problem010 {
public static void reverserQueueFirstKElements(int k, Queue<Integer> q) {
	Stack<Integer> s = new Stack<Integer>();
	for(int i=0; i<k; i++) {
		s.push(q.remove());
	}
	while(!s.isEmpty()) {
		q.add(s.pop());
	}
	for(int i=0; i<q.size()-k;i++) {
		q.add(q.remove());
	}
}
}
