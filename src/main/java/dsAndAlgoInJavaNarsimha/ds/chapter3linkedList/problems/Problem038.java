package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.circularLinkedList.CLLNode;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.circularLinkedList.CircularLinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-38: Split a circular linked list into two equal parts.
 * If the number of nodes is odd, then make first list one node extra than second
 * node.
 * Solution: 
 * Algo:
 * a) Store the mid and last ptrs of circular linked list using Floyd Cycle
 * 	  Finding Algo.
 * b) Make the second half circular
 * c) Make first half circular.
 * d) Set head ptrs of both the linked lists.
 * 
 * Time Complexity: O(n)
 * Sapce Complexity: O(1)
 * @author ashi
 *
 */
public class Problem038 {

	public void splitList(CLLNode head, CLLNode head1, CLLNode head2) {
		CLLNode slowPtr = head;
		CLLNode fastPtr = head;
		if(head== null) {
			return;
		}
		while(fastPtr.getNext()!= head && fastPtr.getNext().getNext() != head) {
			fastPtr=fastPtr.getNext().getNext();
			slowPtr=slowPtr.getNext();
		}
		if(fastPtr.getNext().getNext() == head) {
			fastPtr=fastPtr.getNext();
		}
		head1=head;
		if(head.getNext() != head) {
			head2=slowPtr.getNext();
		}
		fastPtr.setNext(slowPtr.getNext());
		slowPtr.setNext(head);
		Utility.displayLinkedList(fastPtr);
		Utility.displayLinkedList(slowPtr);
		
	}
	public static void main(String[] args) {
		CircularLinkedList list = Utility.getDummyCircularList(20);
		CLLNode head1 = new CLLNode(0);
		CLLNode head2 = new CLLNode(0);
		new Problem038().splitList(list.getHead(), head1, head2);
		
	}
}
