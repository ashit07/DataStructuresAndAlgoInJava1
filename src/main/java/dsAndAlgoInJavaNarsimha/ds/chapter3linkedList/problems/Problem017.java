package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-17: Reverse a singly linked list. 
 * 
 * @author ashi
 *
 */
public class Problem017 {
	/**
	 * Time complexity: O(n)
	 * Space Complexity: O(1)
	 * 
	 * @param head
	 * @return
	 */
public ListNode reverseListIteratively(ListNode head) {
	ListNode currentNode = head;
	ListNode prevNode = null;
	while(currentNode != null) {
		// save next node
		ListNode next = currentNode.getNext();
		// make current node point to prev
		currentNode.setNext(prevNode);
		prevNode = currentNode;
		currentNode = next;
	}
	return prevNode;
}
/**
 * 
 * Time complexity: O(n)
 * Space complexity: O(n) for recursive
 * 
 * @param current
 * @param head
 */
public void reverseListRecursively(ListNode current, ListNode[] head ) {
	if(current == null) {
		return;
	}
	ListNode next = current.getNext();
	if(next==null) {
		head[0] = current;
		return;
	}
	reverseListRecursively(next, head);
	// Make next node points to current node
	next.setNext(current);
	//Remove existing link
	current.setNext(null);
}
private static String displayList(ListNode head) {
		String result="[";
		if(head==null) {
			return result+"]";
		}
		result=result+" head -> "+head.getData();
		
		result=result+" , "+head.getData()+" -> "+head.getNext().getData();
		ListNode temp=head.getNext();
		while(temp != null) {
			if(temp.getNext()!= null){
			result=result+" , "+temp.getData()+" -> "+temp.getNext().getData();
			} else {
				result=result+" , "+temp.getData()+" -> "+temp.getNext();
			}
				
			temp=temp.getNext();
		}
		result=result+"]";
		
		return result;
	
}
public static void main(String [] args) {
	LinkedList linkedList = Utility.getDummylinkedList();
	ListNode node =new Problem017().reverseListIteratively(linkedList.getHead());
	System.out.println(linkedList.toString() + linkedList.getHead().getData());
	System.out.println(displayList(node));
}
}
