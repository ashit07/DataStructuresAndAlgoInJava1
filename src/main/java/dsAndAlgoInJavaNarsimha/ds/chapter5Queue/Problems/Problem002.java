package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.Problems;

import java.util.Stack;

/**
 * Problem-2: How can you implement a queue using 2 stacks?
 * Solution: 
 * @author ashi
 * 
 * Let S1 and S2 be the two stacks used in impl of queue. All we have to do is 
 * define the enqueue and dequeue operations for the queue.
 * 
 * enQueue algo: Just push onto stack S1.
 * Time Complexityi: O(1)
 * 
 * deQueue algo: 
 * a) If stack S2 is not empty, then pop from S2 and return that element.
 * b) If stack is empty, then transfer all elems from S1 to S2 and pop the top elem
 *    from S2 and return that elem.
 * c) If stack S1 is also empty then throw an error.    
 * Time Complexity: From the algo, if stack S2 is not empty then complexity is O(1)
 *  If S1 is empty, then we need to transfer the elems from S1 to S2. But if we carefully
 *  observe, the number of transferred elems and the number of popped elems from 
 *  S2 are equal. Due to this, the avg complexity of pop operation is O(1).
 *  Amortized complexity of pop operation is O(1).
 */
class Problem002 {
  
}
class QueueWithTwoStacks<T>{
	private Stack<T> s1 = new Stack<T>();
	private Stack<T> s2 = new Stack<T>();
	void enqueue(T data) {
		s1.push(data);
	}
	T dequeue(){
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
}
