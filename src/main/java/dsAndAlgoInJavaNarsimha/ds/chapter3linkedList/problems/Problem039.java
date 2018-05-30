package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-39: How will you check if list is palindrome or not?
 * Solution: 
 * Algo: 
 * a) Get the middle of linked list.
 * b) Reverse the second half of linked list.
 * c) Compare the first and second half.
 * d) Construct the original linked list by reversing the second half again
 * 	  and attaching it back to first half.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * @author ashi
 *
 */
public class Problem039 {

	public boolean checkIfPalindrome(ListNode head) {
		ListNode slowPtr=head, fastPtr=head;
		while(fastPtr !=null && fastPtr.getNext() !=null) {
			slowPtr=slowPtr.getNext();
			fastPtr=fastPtr.getNext().getNext(); 
		}
		System.out.println("Middle "+slowPtr.getData());
		ListNode secondReversed = new Problem017().reverseListIteratively(slowPtr);
		Utility.displayLinkedList(secondReversed);
		ListNode temp=head;
		ListNode temp2=secondReversed;
		while(temp != slowPtr || secondReversed != null) {
			if(temp.getData() != secondReversed.getData()) {
				return false;
			}
			temp=temp.getNext();
			secondReversed=secondReversed.getNext();
		}
		new Problem017().reverseListIteratively(temp2);
		return true;
	}
	public static void main(String[] args) {
		LinkedList palindromeList = Utility.getDummyPalindromelinkedList();
		System.out.println(new Problem039().checkIfPalindrome(palindromeList.getHead()));
		Utility.displayLinkedList(palindromeList.getHead());
	}
	
}
