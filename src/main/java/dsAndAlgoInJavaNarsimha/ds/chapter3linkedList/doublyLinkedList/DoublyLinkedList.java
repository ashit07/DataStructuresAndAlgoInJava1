package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.doublyLinkedList;

public class DoublyLinkedList {
private DLLNode head;
private DLLNode tail;
private int length;

public DoublyLinkedList() {
	//DLLNode(data, prev, next)
	head= new DLLNode(Integer.MIN_VALUE, null, null);
	tail= new DLLNode(Integer.MIN_VALUE, head, null);
	head.setNext(tail);
	length=0;
}
/**
 * Find position of head value that is equal to given value	
 * @param data
 * @return
 */
public int getPosition(int data) {
	DLLNode temp = head;
	int pos=0;
	while(temp != null) {
		if(temp.getData()==data) {
			return pos;
		}
		temp=temp.getNext();
		pos++;
	}
	return Integer.MIN_VALUE;
}
/**
 * Returns length of linked list.
 * @return
 */
public int length() {
	return length;
}
/**
 * a) insert node at front.
 */
public void insertHead(int newValue) {
	DLLNode newNode = new DLLNode(newValue, head, head.getNext());
	newNode.getNext().setPrevious(newNode);
	head.setNext(newNode);
	length +=1;
}
/**
 * Add a new value to list at a given position
 * All values at that position to the end move over to make room
 * @param data
 * @param position
 */
public void insert(int data, int position) {
	if(position < 0) {
		position=0;
	}
	if(position > 0) {
		position = length;
	}
	//if list is empty, make it first element
	if(head== null) {
		head = new DLLNode(data);
		tail = head;
	} else if (position==0) {
		DLLNode temp = new DLLNode(data);
		temp.setNext(head);
		head=temp;
	} else {
		DLLNode temp = head;
		for(int i=1; i<position;i++) {
			temp=temp.getNext();
		}
		DLLNode newNode = new DLLNode(data, temp, temp.getNext());
		newNode.getNext().setPrevious(newNode);
		temp.setNext(newNode);
	}
	length +=1;
}
/**
 * insert new node at end of list 
 * @param newValue
 */
public void insertTail(int newValue) {
	DLLNode newNode = new DLLNode(newValue, tail.getPrevious(), tail);
	newNode.getPrevious().setNext(newNode);
	tail.setPrevious(newNode);
	length +=1;
}

/**
 * Removes node at position
 */
public void remove (int position) {
	if(position < 0) {
		position =0;
	}
	if(position > 0) {
		position = length;
	}
	if(head == null) {
		return;
	}
	//If head element
	if(position == 0) {
		head=head.getNext();
		if(head== null) {
			tail= null;
		}
	} else {
		DLLNode temp = head;
		for(int i=1;i<position;i++) {
			temp = temp.getNext();
		}
		temp.getNext().setPrevious(temp.getPrevious());
		temp.getPrevious().setNext(temp.getNext());
	}
	length -=1;
}
/**
 * Remove a node matching specified node from list.
 * @param node
 */
public synchronized void removeMatched(DLLNode node) {
		if(head == null) {
			return;
		}
		if(head.equals(node)) {
			head=head.getNext();
			if(head== null) {
				tail = null;
			}
			return;
		}
		DLLNode temp = head;
		while(temp != null) {
			if(node.equals(temp)) {
				temp.getPrevious().setNext(temp.getNext());
				temp.getNext().setPrevious(temp.getPrevious());
				return;
			}
			temp=temp.getNext();
		}
		length -=1;
}
/**
 * Removes head value from list
 * @return
 */
public int removeHead() {
	if(length == 0) {
		return Integer.MIN_VALUE;
	}
	DLLNode save = head.getNext();
	head.setNext(save.getNext());
	save.getNext().setPrevious(head);
	length -=1;
	return save.getData();
}
/**
 * Removes last element from the list
 * @return
 */
public int removeTail() {
	if(length == 0) {
		return Integer.MIN_VALUE;
	}
	DLLNode save = tail.getPrevious();
	tail.setPrevious(save.getPrevious());
	save.getPrevious().setNext(tail);
	length -=1;
	return save.getData();
}
public void clearList() {
	head = null;
	tail = null;
	length = 0;
}
@Override
public String toString() {
	String result="[]";
	if(length == 0) {
		return result;
	}
	result = "["+head.getNext().getData();
	DLLNode temp = head.getNext().getNext();
	while(temp != tail ) {
		result = result+temp.getData();
		temp = temp.getNext();
	}
	result=result+"]";
	return result;
}
}

