package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem 27: Can we solve Problem-25 in just one scan?
 * Solution: 
 * Efficient approach: Use two pointers. Move one ptr at twice the speed of second. 
 * 	When the first ptr reaches the end of list, the second ptr will be pointing
 *  to the middle list.
 * 
 * Note: If the list has even number of nodes, the middle node will be n/2.
 * 
 * @author ashi
 *
 */
public class Problem028 {
public ListNode findMiddle(ListNode head) {
	ListNode ptr1= head,  ptr2=head;
	int i=0;
	while(ptr1.getNext()!=null) {
		if(i==0) {
			ptr1=ptr1.getNext();
			i=1;
		} else if(i==1) {
			ptr1=ptr1.getNext();
			ptr2=ptr2.getNext();
			i=0;
		}
	}
	return ptr2;
}
	public static void main(String[] args) {
		LinkedList list = Utility.getDummylinkedList(10);
		System.out.println(new Problem028().findMiddle(list.getHead()).getData());
	}
}
