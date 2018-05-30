package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.Problems;

/**
 * Problem-1: Given an algo for reversing a queue Q. To access the queue, you
 * are allowed to use methods of queue ADT.
 *
 * Solution:
 * Time Complexity: O(n)
 */
import java.util.Stack;

import dsAndAlgoInJavaNarsimha.ds.chapter5Queue.linkedListQueue.LinkedQueue;

class Problem001 {


}
class QueueReversal {
	public LinkedQueue reverseQueue(LinkedQueue queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()) {
			try {
				stack.push(queue.dequeue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while(!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
		return queue;
	}
}
