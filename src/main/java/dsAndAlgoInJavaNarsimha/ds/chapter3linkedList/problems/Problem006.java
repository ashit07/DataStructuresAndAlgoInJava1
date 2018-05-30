package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-6: Can we solve problem-5 using recursion?
 * Solution: We can use a global variable to track the post recursive call and when it is
 * same as Nth, return the node.
 * 
 * Time Complexity: O(n) for pre-recursive calls and O(n) for post-recursive calls. = O(2n) ~ O(n) 
 * Space Complexity: O(n) for recursive stack
 * @author ashi
 *
 */
class Problem006 {
	int counter=0;
	ListNode head=null;
	public ListNode nthNodeFromEnd(ListNode head, int Nth) {
		if(head !=null) {
				nthNodeFromEnd(head.getNext(), Nth);
			counter++;
			if(Nth==counter) {
				this.head=head;
			}
		}
		return this.head;
	}
	public static void main (String [] args) {
		LinkedList list = Utility.getDummylinkedList();
		ListNode nthNodeFromEnd = new Problem006().nthNodeFromEnd(list.getHead(), 2);
		if(nthNodeFromEnd != null) {
			System.out.println(nthNodeFromEnd.getData());
		}
	}
}
