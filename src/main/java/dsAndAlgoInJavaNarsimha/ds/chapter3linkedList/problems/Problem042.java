package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

public class Problem042 {
	public ListNode reverseKNodes(ListNode head, int k) {
		ListNode curr=head;
		ListNode prevCurr=head, prevTail=null;
		while(curr != null){
			ListNode tail=null;
			int count=k;
			while(curr !=null && count >0 ){
				ListNode next = curr.getNext();
				curr.setNext(tail);
				tail = curr;
				curr=next;
				count--;
			}
			if(prevTail != null) {
				prevTail.setNext(tail);
			} else {
				head=tail;
			}
			
			prevTail=prevCurr;
			prevCurr= curr;
		}
		
		return head;
	}
	public static void main(String[] args) {
		LinkedList list3 = Utility.getDummylinkedList();
		ListNode reversed3 = new Problem042().reverseKNodes(list3.getHead(), 2);
		Utility.displayLinkedList(reversed3);

		System.out.println("--------------------------");
		
		LinkedList list4 = Utility.getDummylinkedList();
		ListNode reversed4 = new Problem042().reverseKNodes(list4.getHead(), 3);
		Utility.displayLinkedList(reversed4);

	}

}
