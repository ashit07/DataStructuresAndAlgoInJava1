package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.Problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem-3: Show how can you efficiently implement one stack from two 
 * queues. Analyze the running time of stack operations.
 * 
 * Solution: 	
 * Let Q1 and Q2 be the two queues to be used in impl of stack.
 * 
 * Push Operation algo: Insert the elem in whichever queue is not empty.
 * a) Check whether Q1 is empty. If empty, enqueue the elem into Q2
 * b) Else enqueue the elem in Q2.
 * Time Complexity: O(1)
 * 
 * Pop Operation algo: Transfer n-1 elems to other queue and delete last from queue
 * for performing pop operation.
 * a) If queue Q1 is not empty then transfer n-1 elems from Q1 to Q2 and then,
 *    deQueue the last elem of Q1 and return it.
 * b) If Q2 is not empty then transfer n-1 elems from Q2 to Q1 and then, dequeue 
 *    the last elem of Q2 and return it.
 * Time Complexity: O(n) as each time pop is called, we are transferring all elems
 * from one queue to other.   
 * @author ashi
 *
 */
class Problem003 {
 public StackWithTwoQueues<?> getInstance() {
	 return new StackWithTwoQueues();
 }
}
class StackWithTwoQueues<T>{
 private Queue<T> q1 = new LinkedList<T>();	
 private Queue<T> q2 = new LinkedList<T>();	
 void push(T data) {
	 if(q1.isEmpty()) {
		 q2.offer(data);
	 } else {
		 q1.offer(data);
	 }
 }
 T pop () {
	 int i=0, size;
	 if(q2.isEmpty()) {
		 size = q1.size();
		 while(i<size-1) {
			 q2.offer(q1.poll());
			 i++;
		 }
		 return q1.poll();
	 } else {
		 size = q2.size();
		 while(i<size-1) {
			 q1.offer(q2.poll());
			 i++;
		 }
		 return q2.poll();
	 }
 }
}