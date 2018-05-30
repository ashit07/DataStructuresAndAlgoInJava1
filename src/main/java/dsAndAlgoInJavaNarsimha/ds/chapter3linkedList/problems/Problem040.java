package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-40: Exchange the adjacent elements in linked list.
 * Solution:
 * 
 * 
 * @author ashi
 *
 */
public class Problem040 {
public ListNode exchangeAdjacentNodes(ListNode head) {
	ListNode temp= new ListNode(0);
	temp.setNext(head);
	ListNode curr=head, prev=temp;
	while(curr !=null && curr.getNext()!=null ) {
		ListNode tmp = curr.getNext().getNext();
		curr.getNext().setNext(prev.getNext());
		prev.setNext(curr.getNext());
		curr.setNext(tmp);
		prev=curr;
		curr=prev.getNext();
	}
	return temp.getNext();
}
public static void main(String [] args) {
	//LinkedList list = Utility.getDummylinkedList();
	LinkedList list = new LinkedList();
	list.insert(1, 0);
	list.insert(2, 1);
	list.insert(3, 2);
	list.insert(4, 3);
	ListNode temp = new Problem040().exchangeAdjacentNodes(list.getHead());
	Utility.displayLinkedList(temp);
}
}
