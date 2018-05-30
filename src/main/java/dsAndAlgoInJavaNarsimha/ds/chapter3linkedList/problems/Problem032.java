package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-32:
 * Given two sorted Linked Lists, we need to merge them into the third list
 *  in sorted order.
 *  Solution: 
 *  
 *  Time Complexity: O(n)
 * @author ashi
 *
 */
public class Problem032 {
	public ListNode mergeTwoSortedLists(ListNode head1, ListNode head2) {
		if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head1;
		}
		ListNode head = new ListNode(0);
		if(head1.getData()<=head2.getData()) {
			head=head1;
			head.setNext(mergeTwoSortedLists(head1.getNext(), head2));
		} else {
			head=head2;
			head.setNext(mergeTwoSortedLists(head2.getNext(), head1));
		}
		return head;
	}
}
