package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import java.util.HashMap;
import java.util.Map;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-45: Given a linked list consists of data, next ptr and random ptr which
 * pts to random node in list.
 * Give an algo to clone the list;
 * 
 *  * @author ashi
 *
 */
public class Problem045 {
 public ListNode cloneList(ListNode head) {
	 ListNode x=head, y=null;
	 Map<ListNode, ListNode> map = new HashMap<ListNode, ListNode> ();
	 while(x!=null) {
		 y= new ListNode(x.getData());
		 y.setNext(null);
		 map.put(x, y);
		 x=x.getNext();
	 }
	 x=head;
	 while(x!=null) {
		 y=map.get(x);
		 y.setNext(map.get(x.getNext()));
		 x=x.getNext();
	 }
	 return map.get(head);
 }
	public static void main(String [] args) {
		LinkedList list = Utility.getDummylinkedList();
		ListNode clonedHead = new Problem045().cloneList(list.getHead());
		Utility.displayLinkedList(clonedHead);
	}
}
