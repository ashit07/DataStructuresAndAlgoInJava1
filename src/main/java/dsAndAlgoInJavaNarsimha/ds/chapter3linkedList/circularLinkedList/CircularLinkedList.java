package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.circularLinkedList;

public class CircularLinkedList {

	CLLNode tail;
	int length;
	/**
	 * Constructs a new circular list
	 */
	public CircularLinkedList() {
	  tail = null;
	  length=0;
	}
	//Gets head
	public CLLNode getHead() {
		return tail;
	}
	//Adds to beginning of list
	public void addToHead(int data) {
		CLLNode nodeToAdd = new CLLNode(data);
		if(tail == null) {
			tail=nodeToAdd;
			tail.setNext(nodeToAdd);
		} else {
			nodeToAdd.setNext(tail.getNext());
			tail.setNext(nodeToAdd);
		}
		length++;
			
	}
	
	// Adds data to beginning of list.
	public void add(int data){
		addToHead(data);
	}
	// Adds to tail
	public void addToTail(int data) {
		addToHead(data);
		tail=tail.getNext();
	}
	
	// Returns data at head of list
	public int peek() {
		return tail.getNext().getData();
	}
	
	//Returns data at tail of list
	public int tailPeek() {
		return tail.getData();
	}
	
	//Returns amd removes data from head of list
	public int removeFromHead() {
		CLLNode temp = tail.getNext();
		if(tail == tail.getNext()) {
			tail =null;
		} else {
			tail.setNext(temp.getNext());
			temp.setNext(null);
		}
		length--;
		return temp.getData();
	}
	//Returns and remove data from end of list
	public int removeFromTail() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		CLLNode finger = tail;
		while(finger.getNext() != tail ) {
			finger = finger.getNext();
		}
		// finger now points to second-to-last node
		CLLNode temp = tail;
		if(finger == tail) {
			tail = null;
		} else {
			finger.setNext(tail.getNext());
			tail = finger;
		}
		length--;
		return temp.getData();
	}
	//Returns true if list contains data, else false
	public boolean contains(int data) {
		if(tail == null) return false;
		CLLNode finger= tail.getNext();
		while(finger.getNext() != tail && (finger.getData()!= data)){
			finger = finger.getNext();
		}
		return finger.getData() == data;
	}
	
	// Removes and returns element equal to data or Null
	public int remove(int data) {
		if(tail == null) return Integer.MIN_VALUE;
		CLLNode finger = tail.getNext();
		CLLNode previous = tail;
		int compares;
		for(compares = 0; compares < length && (!(finger.getData() == data)); compares++) {
			previous = finger;
			finger = finger.getNext();
		}
		if(finger.getData() == data){
			if(tail == tail.getNext()) {
				tail = null;
			} else {
				if(finger == tail) {
					tail = previous;
				}
				previous.setNext(previous.getNext().getNext());
			}
			finger.setNext(null);
			length--;
			return finger.getData();
		}
		return Integer.MIN_VALUE;
	}
	private boolean isEmpty() {
		return tail==null;
	}
	public int length() {
		return length;
	}
	public void clear() {
		tail = null;
		length=0;
	}
	public String toString() {
		String result="[";
		if(tail==null) {
			return result+"]";
		}
		result=result+tail.getData();
		CLLNode temp = tail.getNext();
		while (temp != tail){
			result = result +" , "+temp.getData();
			temp = temp.getNext();
		}
		return result+"]";
	}
}
