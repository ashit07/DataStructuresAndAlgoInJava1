package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem 30: Check whether given linkedList is even or odd?
 * Solution:
 * Use 2x ptr. Take a ptr that moves at 2x(two nodes at a time).
 * At the end, if length is even, the pointer will be null else it will pt to 
 * last element.
 *   
 * @author ashi
 *
 */
public class Problem030 {
public int isLinkedListLengthEven (ListNode head) {
	while(head != null && head.getNext() !=null) {
		head=head.getNext().getNext();
	}
	if(head == null) {
		return 0;
	}
	return 1;
}
public static void main(String[] args) {
	System.out.println(new Problem030().isLinkedListLengthEven(Utility.getDummylinkedList().getHead()));
}
}
