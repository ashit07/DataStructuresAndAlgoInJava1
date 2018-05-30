package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-2:   Find nth node from end of Linked List.
 * Solution:	<Brute-Force Approach> In this method, start with first node  and count 
 * the number of nodes present after that node. If the number of nodes are < n-1 then return saying 
 * "fewer number of nodes in list". If number of nodes are > n-1 then go to next node. Continue this until 
 * number of nodes after currentNode are n-1.
 * 
 *  Time complexity: O(n^2) for scanning the remaining list(from current node) for each node.
 *  Space Complexity: O(1).
 * @author ashi
 *
 */
class Problem002 {
	public static int getPositionFromLast( LinkedList list, int n) {
		
		ListNode temp = list.getHead();
		int length = list.getLength();
		if(length < n) {
			return Integer.MIN_VALUE;
		} 
		int elementPos = length - n;
		
		for(int i=0; i< elementPos; i++) {
			temp = temp.getNext();
		}
		return temp.getData();
		
	}
	
	public static void main(String [] args) {
		LinkedList linkedList = Utility.getDummylinkedList();
		System.out.println(getPositionFromLast(linkedList, 9));
	}
}
