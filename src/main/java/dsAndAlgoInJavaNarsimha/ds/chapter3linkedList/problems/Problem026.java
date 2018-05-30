package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-26: Can we improve complexity of Problem-25?
 * Solution: Yes.
 * 
 * Algo: 
 * a) Traverse the list and find the length of the list.
 * b) After find the length, again scan the list and locate n/2 node from beg.
 * 
 * Time Complexity: O(n)+O(n) ~O(n)
 * Space Complexity: O(1)
 * @author ashi
 *
 */
public class Problem026 {
	public ListNode findMiddleElement(ListNode head) {
		ListNode temp = head;
		int length=0;
		while(temp != null) {
			length++;
			temp=temp.getNext();
		}
		temp = head;
		for (int i=1;i<length/2;i++) {
			temp=temp.getNext();
		}
		return temp;
	}
	public static void main(String[] args) {
		LinkedList list = Utility.getDummylinkedList();
		ListNode temp1 = new Problem026().findMiddleElement(list.getHead());
		System.out.println(temp1.getData());
	}
}
