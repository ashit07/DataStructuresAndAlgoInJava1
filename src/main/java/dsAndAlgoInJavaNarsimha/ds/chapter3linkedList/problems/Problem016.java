package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-16: Insert a node in a sorted linked list.
 * Solution: Traverse the list and find a position for the element and
 * 	traverse it.
 * 
 * Space Complexity: O(n)
 * Time Complexity: O(1)
 * 
 * @author ashi
 *
 */
public class Problem016 {
	public ListNode insertInSortedLinkedList(ListNode head, ListNode newNode) {
		ListNode current = head;
		if(head == null) {
			return newNode;
		}
		ListNode temp=null;
		while(current != null && current.getData() < newNode.getData()) {
			temp = current;
			current = current.getNext();
		}
		// insert the new node before the big item
		newNode.setNext(current);
		temp.setNext(newNode);
		return head;
	}
	
	public static void main(String [] args) {
		LinkedList sortedList = Utility.getDummySortedlinkedList();
		sortedList.removeFromEnd();
		ListNode head = new Problem016().insertInSortedLinkedList(sortedList.getHead(), new ListNode(60));
		System.out.println(sortedList.toString());
		
	}
}
