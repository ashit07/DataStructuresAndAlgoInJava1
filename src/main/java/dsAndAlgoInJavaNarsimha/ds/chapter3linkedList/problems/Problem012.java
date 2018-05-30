package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-12: Check whether the given linked list is either Null-Terminated or not.
 * If there is a cycle, find the start node of loop.
 * 
 * Solution: Solution is an extension of Problem-10.
 * After finding the loop, we initialize the slowPtr to head of linked list.
 * 
 * From that point onwards slowPtr and fastPtr moves one node at a time.
 * The point at which they meet is the start of loop. 
 * This is how we remove the loop.
 * 
 * @author ashi
 *
 */
public class Problem012 {

	public  ListNode findBeginOfLoop(ListNode head) {		
		ListNode slowPtr=head, fastPtr=head;
		boolean isLoop = false;
		while(fastPtr != null && fastPtr.getNext() !=null) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr) {
				isLoop = true;
				break;
			}
		}
		if(isLoop) {
			slowPtr= head;
			while(slowPtr != fastPtr) {
				slowPtr = slowPtr.getNext();
				fastPtr = fastPtr.getNext();
			}
			return fastPtr;
		}
		return null;
	}
	public static void main(String[] args) {
		LinkedList cyclicList = Utility.getDummyCycliclinkedList();
		System.out.println(new Problem012().findBeginOfLoop(cyclicList.getHead()).getData());
	}
	
}
