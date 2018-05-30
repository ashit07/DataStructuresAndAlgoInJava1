package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * 
 * Problem-10: Can we solve problem-7 in O(n)?
 * 
 * Solution: Yes, Efficient Approach (Memory Less Approach).
 * 
 * Using Floyd Cycle Finding Algorithm
 * It takes 2 ptrs moving at diff speeds to walk linked list.
 * Once they enter loop, they are expected to meet, which denotes there is loop.
 * This works because the only way a faster moving ptr will point to same loc as
 * slow moving ptr is, if somehow the entire list or a part of it is circular.
 *  
 * So, here slow ptr moves one ptr at a time and fast ptr moves two ptr at a time.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *  
 * @author ashi
 *
 */
 class Problem010 {

	public boolean isCyclic(ListNode head) {
		ListNode slowPtr = head, fastPtr = head;
		while(fastPtr !=null && fastPtr.getNext() !=null){
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args) {
		LinkedList cyclicList = Utility.getDummyCycliclinkedList();
		System.out.println(new Problem010().isCyclic(cyclicList.getHead()));
		
		LinkedList nonCyclicList = Utility.getDummylinkedList();
		System.out.println(new Problem010().isCyclic(nonCyclicList.getHead()));
		
	}
}
