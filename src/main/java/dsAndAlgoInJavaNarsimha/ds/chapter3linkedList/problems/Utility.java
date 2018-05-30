package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.circularLinkedList.CLLNode;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.circularLinkedList.CircularLinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

public class Utility {
	/**
	 * Returns a linked list with 20 elements
	 * @return
	 */
	public static LinkedList getDummylinkedList() {
	LinkedList linkedList = new LinkedList();
	int data = 40;
	for(int i=0; i<20; i++) {
		linkedList.insert(data++, i);
	}
	System.out.println(linkedList.toString());
	return linkedList;
	}
	
	/**
	 * Returns a linked list with 20 elements
	 * @return
	 */
	public static LinkedList getDummyPalindromelinkedList() {
	LinkedList linkedList = new LinkedList();
	int data = 40;
	for(int i=0; i<20; i++) {
		if(i<10) {
			linkedList.insert(data++, i);
		} else {
			linkedList.insert(--data, i);
		}
	}
	System.out.println(linkedList.toString());
	return linkedList;
	}
	/**
	 * Returns a sorted Linked list
	 * @return
	 */
	public static LinkedList getDummySortedlinkedList() {
		LinkedList linkedList = new LinkedList();
		int data = 40;
		for(int i=0; i<20; i++) {
			linkedList.insert(data++, i);
		}
		System.out.println(linkedList.toString());
		return linkedList;
	}
	public static void displayLinkedList(ListNode head) {
		ListNode temp = head;
		System.out.print("head->");
		while(temp.getNext()!=null) {
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.print(temp.getData());
		System.out.println("");
		
	}
	public static void displayLinkedList(CLLNode head) {
		CLLNode temp = head;
		System.out.print("head->");
		while(temp.getNext()!=head) {
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.print(temp.getData());
		System.out.println("");
		
	}
	/**
	 * Returns a linked list with size
	 * @return
	 */
	public static LinkedList getDummylinkedList(int size) {
		LinkedList linkedList = new LinkedList();
		int data = 40;
		for(int i=0; i<size; i++) {
			linkedList.insert(data++, i);
		}
		System.out.println(linkedList.toString());
		return linkedList;
	}
	public static LinkedList getDummySortedlinkedList(int size, int startData) {
		LinkedList linkedList = new LinkedList();
		for(int i=0; i<size; i++) {
			linkedList.insert(startData++, i);
		}
		System.out.println(linkedList.toString());
		return linkedList;
	}
	public static LinkedList getDummyCycliclinkedList() {
		LinkedList linkedList = new LinkedList();
		int data = 40;
		for(int i=0; i<15; i++) {
			linkedList.insert(data++, i);
		}
		// last node (14) now points to node (10) for a cyclic loop. 
		ListNode lastNode = linkedList.getNode(14);
		System.out.println("get 14 "+ lastNode.getData());
		lastNode.setNext(linkedList.getNode(9).getNext());
		
		//System.out.println(linkedList.toString());
		return linkedList;
	}
	public static CircularLinkedList getDummyCircularList(int size) {
		CircularLinkedList list = new CircularLinkedList();
		int data=40;
		for(int i=0; i<size;i++) {
			list.add(data++);
		}
		System.out.println(list.toString());
		return list;
	}
}
