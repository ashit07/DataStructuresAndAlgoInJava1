package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import java.util.HashSet;
import java.util.Set;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-8: Can we use hashing technique to solve the above problem?
 * Solution: Yes,
 * Algo:
 *  a) Traverse the linked list nodes one by one.
 *  b) Check if address of node is already available in hash table or not.
 *  c) If available, then that indicates we are visiting the node that was already visited. This is possible only if the given linked list has loop in it.
 *  d) If address is not available, then insert the node's address into hash table.
 *  e) Continue till we reach end or we find a loop.
 * 
 * Time Complexity: O(n) for scanning linked list. Only scan of input.
 * Space Complexity: O(n) for HashSet
 * 
 * @author ashi
 *
 */
class Problem008 {
	
	public boolean containsCyclicLoopHashing(ListNode head) {
		Set<ListNode> addressList = new HashSet<ListNode>();
		ListNode temp = head;
		while(temp!=null) {
			if(addressList.contains(temp)) {
				return true;
			}
			addressList.add(temp);
			temp = temp.getNext();
		}
		return false;
	}
	
	public static void main(String [] args) {
		LinkedList cyclicList = Utility.getDummyCycliclinkedList();
		LinkedList nonCyclicList = Utility.getDummylinkedList();
		System.out.println(new Problem008().containsCyclicLoopHashing(cyclicList.getHead()));
		System.out.println(new Problem008().containsCyclicLoopHashing(nonCyclicList.getHead()));
		
	}
}
