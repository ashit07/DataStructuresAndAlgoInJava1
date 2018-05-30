package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.circularLinkedList;

public class CLLNode {

	private int data;
	private CLLNode next;
	public CLLNode(int data) {
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public CLLNode getNext() {
		return this.next;
	}
	public void setNext(CLLNode next) {
		this.next = next;
	}
}