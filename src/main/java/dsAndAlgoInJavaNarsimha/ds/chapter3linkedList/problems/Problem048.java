package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * ----------Not Completed----------
 * Problem-48: Find modular list from end.
 * Given a singly linked list, write a function to find the first element 
 * from the end whose n%k == 0, where n is the number of elements in the list and
 * k is an integer constant. For example, if n=19 and k=3, then we should return
 * 16th node.
 * Solution:
 * Time Complexity: O(n)
 * Space Complexity: O(1) 
 *
 * @author ashi
 *
 */
public class Problem048 {
	public ListNode modularNode(ListNode head, int k) {
		ListNode modularNode = null;
		int i=0;
		if(k<=0) {
			return null;
		}
		for(;i<k; i++) {
			if(head !=null) {
				head = head.getNext();
			} else {
				return null;
			}
		}
		
		return modularNode;
	}
}
