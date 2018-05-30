package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem 15: Check whether given linked list is NULL-terminated. 
 * If there is a cycle, find the length of loop.
 * 
 * Solution: This is also extension of basic cycle detection problem. 
 * 	After finding the loop in linked list, keep the slowPtr as it is.
 * 	fastPtr keeps on moving until it again comes back to slowPtr.
 * 	While moving, use a counter var which increments at rate of 1. 
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * @author ashi
 *
 */
public class Problem015 {

	public int findLengthOfLoop(ListNode head) {
		ListNode fastPtr =head, slowPtr = head;
		boolean loopExists = false;
		int counter = 0;
		while(fastPtr != null && fastPtr.getNext() != null) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr) {
				loopExists = true;
				break;
			}
		}
		if(loopExists) {
			do{
				slowPtr = slowPtr.getNext();
				counter++;
			} while(slowPtr != fastPtr);
		}
		return counter;
	}
	public static void main(String [] args) {
		LinkedList cyclicList = Utility.getDummyCycliclinkedList();
		System.out.println(new Problem015().findLengthOfLoop(cyclicList.getHead()));;
	}
}
