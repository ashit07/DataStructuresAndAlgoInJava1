package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.linkedListQueue;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * EnQueue is performed by adding an element at the end of list.
 * DeQueue is performed by deleting an element from the start of list.
 * @author ashi
 *
 * Let n be the number of elems in queue, then
 * Space complexity (for n enQueue operations): O(n)
 * Time complexity of enQueue() 			  : O(1) (Average)
 * Time complexity of deQueue()				  : O(1)
 * Time complexity of isEmpty()				  : O(1)
 */
public class LinkedQueue {
private int length;
private ListNode front,rear;
public LinkedQueue() {
	length=0;
	front=rear=null;
}
public void enqueue(int data) {
	ListNode node = new ListNode(data);
	if(isEmpty()) {
		front=node;
	} else {
		rear.setNext(node);
	}
	rear=node;
	length++;
}
public int dequeue() throws Exception {
	if(isEmpty()) throw new Exception("Queue is empty");
	int result = front.getData();
	front=front.getNext();
	length--;
	if(isEmpty()) rear=null;
	return result;
}
public boolean isEmpty() {
	return length==0;
}
public int first() throws Exception {
	if(isEmpty()) throw new Exception();
	return front.getData();
}
public String toString() {
	String result="[";
	ListNode current = front;
	while(current != null) {
		result+=current.toString()+"\n";
		current = current.getNext();
	}
	return result;
}
}
