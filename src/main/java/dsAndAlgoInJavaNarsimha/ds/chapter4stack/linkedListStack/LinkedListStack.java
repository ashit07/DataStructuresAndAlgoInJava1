package dsAndAlgoInJavaNarsimha.ds.chapter4stack.linkedListStack;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

public class LinkedListStack {
int length;
private ListNode top;

public LinkedListStack () {
	length = 0;
	top = null;
}

public void push(int data) {
	ListNode temp = new ListNode(data);
	temp.setNext(top);
	top = temp;
	length++;
}


public int pop() throws Exception {
	if (isEmpty()) {
		throw new Exception("Stack is empty");
	}
	int result = top.getData();
	top = top.getNext();
	length --;
	return result;
}

public int peek() {
	return top.getData();
}

public int size() {
	return length;
}

public boolean isEmpty() {
	return length==0;
}
//Returns a string representation of stack as a list of elements, with 
//the top element at the end. This method runs in O(n) time, where n is 
//the size of stack.
public String toString() {
	String s ="[";
	ListNode current = top;
	s+=s+current.getData();
	current = current.getNext();
	while(current != null ) {
		s+= ","+current.getData();
		current = current.getNext();
	}
	return s+"]";
}
}
