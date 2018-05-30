package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-47: Find Modular Node: Given a singly linked list, write a function
 * to find the last element from the beginning whose n%k==0, where n is the
 * number of elements in the list and k is an integer constant. For example,
 * if n=19 and k=3 then we should return 18th node.
 * 
 * Solution:
 * For this problem, the value of n is not known in advance.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * @author ashi
 *
 */
public class Problem047 {
public ListNode modularNode(ListNode head, int k) {
	ListNode modularNode = null;
	int i=0;
	if(k<=0) {
		return null;
	}
	for(;head!=null; head=head.getNext()) {
		if(i%k == 0) {
			modularNode=head;
		}
		i++;
	}
	return modularNode;
}
	public static void main(String[] args) {
		LinkedList list = Utility.getDummylinkedList();
		ListNode node = new Problem047().modularNode(list.getHead(), 3);
		System.out.println(node.getData());
	}
}
