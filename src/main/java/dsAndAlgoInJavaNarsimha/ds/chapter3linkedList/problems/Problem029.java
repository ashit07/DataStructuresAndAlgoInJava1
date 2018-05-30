package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-29: How will you display a linkedlist from end?
 * Solution: Using recursion
 * Traverse linked list till end and then while coming back, start printing elements.
 * @author ashi
 *
 */
public class Problem029 {

	public void printListFromEnd(ListNode head) {
		if(head==null) {
			return;
		}
		printListFromEnd(head.getNext());
		System.out.print(head.getData()+"->");
	}
	public static void main(String[] args) {
		LinkedList list = Utility.getDummylinkedList();
		new Problem029().printListFromEnd(list.getHead());
	}
}
