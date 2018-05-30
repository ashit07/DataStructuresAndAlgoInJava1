package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/*
 * Problem-49: Find fractional node: Given a singly linked list, write a fn
 * to find the n/k th element, where n is the number of element in list.
 * 
 * Solution: For this problem, n is not known in advance.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @author ashi
 *
 */
public class Problem049 {
public ListNode getFractionalNode(ListNode head, int k) {
	ListNode fractionalNode = head;
	int i=0;
	if(k<=0) {
		return null;
	}
	for(;head!=null;head=head.getNext()) {
		if(i%k==0) {
			if(fractionalNode != null) {
				fractionalNode = head;
			} else {
				fractionalNode = fractionalNode.getNext();
			}
		}
		i++;
	}
	return fractionalNode;
}
public static void main(String[] args) {
	LinkedList list = Utility.getDummylinkedList();
	ListNode fractionalNode = new Problem049().getFractionalNode(list.getHead(), 4);
	System.out.println(fractionalNode.getData());
}
}
