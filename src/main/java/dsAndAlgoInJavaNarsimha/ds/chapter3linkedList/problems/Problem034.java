package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem 34: Reverse the linked list in pairs. If you have a linked list that 
 * holds 1->2->3->4->X, then after the function has been called the linked list
 * would hold 2->1->4->3->X.
 * 
 * Solution: 1->2->3->4->X
 *  1. hold head.next in temp1 variable i.e. temp1=2;
 *  2. point 1 to 3 i.e. set head.next = head.next.next;
 *  3. point 2 to 1 i.e set temp1.next to head
 *  4. repeat till head != null
 *  
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @author ashi
 *
 */
public class Problem034 {
	public ListNode reversePairRecursively(ListNode head) {
		ListNode temp;
		if(head== null || head.getNext() ==null) {
			return null;
		}
		//Reverse first pair
		temp = head.getNext();
		head.setNext(temp.getNext());
		temp.setNext(head);
		head = temp;
		
		head.getNext().setNext(reversePairRecursively(head.getNext().getNext()));
		return head;		
	}
	public  ListNode reversePairIteratively(ListNode head) {
		ListNode temp1=null;
		ListNode temp2=null;
		while(head != null && head.getNext() !=null) {
			if(temp1 != null) {
				temp1.getNext().setNext(head.getNext());
			}
			temp1=head.getNext();      //temp1 = 2
			head.setNext(head.getNext().getNext()); //head=1 head.next =3
			temp1.setNext(head);		//temp1=2 temp1.next =1
			if(temp2== null) {
				temp2=temp1;			//temp2=2, temp2.next = 1, temp2.next.next=3
			}
			head=head.getNext();		//head =3
		}
		return temp2;
	}
	public static void main(String[] args) {
		LinkedList list1 = Utility.getDummySortedlinkedList(6, 1);
		ListNode reversedIteratively = new Problem034().reversePairIteratively(list1.getHead());
		System.out.println("Iterative reverse: ");
		Utility.displayLinkedList(reversedIteratively);
		System.out.println("--------------");
		
		
		LinkedList list2 = Utility.getDummySortedlinkedList(6, 1);
		ListNode reversedRecursively = new Problem034().reversePairRecursively(list2.getHead());
		System.out.println("Recursive reverse: ");
		Utility.displayLinkedList(reversedRecursively);
		
	}
}
