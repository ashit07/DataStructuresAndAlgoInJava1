package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-5: Can we solve problem -2 in one scan?
 * Solution: Use two pointers pNthNode and pTemp. Initially, both points to head node. pNthNode starts moving
 * only after pTemp made n moves. From there both moves forward until pTemp reaches end of list. As a result, pNthNode
 * points to nth node from end of linked list.
 *  
 *  Let us say we have a list of 10 elements and we want to find 3rd element from last.
 *  So, pTemp and pNthNode points to head element initially.
 *  According to the solution, pTemp makes n=3 moves (remaining 7 moves till end). 
 *  Now, pNthNode also starts moving till pTemp.next=null; 
 *  pNthNode points to 7th element in this case, 3rd from last.
 *  
 *  Time complexity: O(n)
 *  Space complexity: O(1)
 * @author ashi
 *
 */

class Problem005 {

	public ListNode nthNodeFromEnd(ListNode head, int nthNode) {
		ListNode pTemp = head, pNthNode = null;
		for(int count=1; count< nthNode; count++) {
			if(pTemp!=null) {
				pTemp = pTemp.getNext();
			}
		}
		while(pTemp != null) {
			if(pNthNode == null) {
				pNthNode = head;
			} else {
				pNthNode = pNthNode.getNext();
			}
			pTemp = pTemp.getNext();
		}
		if(pNthNode != null) {
			return pNthNode;			
		}
		return null;
	}
	public static void main (String [] args) {
		LinkedList list = Utility.getDummylinkedList();
		System.out.println(new Problem005().nthNodeFromEnd(list.getHead(), 2).getData());
		
	}
}