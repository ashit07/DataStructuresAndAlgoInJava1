package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-33: Can we solve problem 32 without recursion?
 * Solution: 
 * 
 * Time Complexity: O(n)
 * @author ashi
 *
 */
public class Problem033 {
public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
	ListNode head= new ListNode(0);
	ListNode curr = head;
	while(head1 !=null && head2 !=null) {
		if(head1.getData() < head2.getData()) {
			curr.setNext(head1);
			curr=curr.getNext();
			head1=head1.getNext();
		} else {
			curr.setNext(head2);
			curr=curr.getNext();
			head2=head2.getNext();
		}
	}
		if(head1 !=null) {
			curr.setNext(head1);
		} else if(head2!=null) {
			curr.setNext(head2);
		}
		return head.getNext();
}
public static void main(String[] args) {
	LinkedList sortedList1 = Utility.getDummySortedlinkedList(10, 20);
	LinkedList sortedList2 = Utility.getDummySortedlinkedList(10, 25);
	ListNode head = new Problem033().mergeTwoLists(sortedList1.getHead(), sortedList2.getHead());
	Utility.displayLinkedList(head);
}
}
