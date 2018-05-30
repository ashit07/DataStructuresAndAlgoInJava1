package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.doublyLinkedList;


/**
 * Holds the head of list
 * @author ashi
 *
 */
public class DLLNode {
private DLLNode next;
private DLLNode previous;
private int data;
public DLLNode(int data) {
	this.data=data;
	this.previous = null;
	this.next = null;
}

public DLLNode(int data, DLLNode previous, DLLNode next) {
	super();
	this.next = next;
	this.previous = previous;
	this.data = data;
}
public DLLNode getNext() {
	return next;
}
public void setNext(DLLNode next) {
	this.next = next;
}
public DLLNode getPrevious() {
	return previous;
}
public void setPrevious(DLLNode previous) {
	this.previous = previous;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}


}
