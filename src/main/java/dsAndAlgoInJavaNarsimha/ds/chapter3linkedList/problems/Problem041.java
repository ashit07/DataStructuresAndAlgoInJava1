package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-41: For a given K value(K>0) reverse blocks of K nodes in a list.
 * Example: Input 1 2 3 4 5 6 7 8 9 10
 * For K=2: 2 1 4 3 6 5 8 7 10 9
 * K=3: 3 2 1 6 5 4 9 8 7 10
 * K=4: 4 3 2 1 8 7 6 5 9 10
 * 
 * Solution: This is an extension to swapping nodes in a list.
 * a) Check is the remaining list has K nodes in it.
 * 		i)  If yes, get the ptr of K+1th node 
 * 		ii) Else return 
 * b) Reverse the first K nodes.
 * c) Set next of last node(after reversal) to K+1th node.
 * d) Move to k+1th node.
 * e) Go to step1
 * f) k-1th node of first K nodes becomes new head if available, 
 * 	  else we can return the head.  
 * @author ashi
 *
 */
public class Problem041 {
	public ListNode reverseKNodesRecursive(ListNode head, int k){
		ListNode curr=head;
		int count=k;
		ListNode next=null;
		ListNode prev=null;
		
		while(curr != null && count > 0) {
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr = next;
			count--;
		}
		// Now next points to K+1th node, return the pointer of head node
		if(next != null) {
			head.setNext(reverseKNodesRecursive(next, k));
		}
		return prev;
	}
	
	
	public static void main(String[] args) {
		LinkedList list = Utility.getDummylinkedList();
		ListNode reversed1 = new Problem041().reverseKNodesRecursive(list.getHead(), 2);
		Utility.displayLinkedList(reversed1);
		
		System.out.println("--------------------------");
		
		LinkedList list2 = Utility.getDummylinkedList();
		ListNode reversed2 = new Problem041().reverseKNodesRecursive(list2.getHead(), 3);
		Utility.displayLinkedList(reversed2);
		

	}
}
