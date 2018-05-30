package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.unrolledLinkedList;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;

public class UnrolledLinkedList<E> extends AbstractList<E> implements List<E>{

	private int size=0;
	private ListNode firstNode;
	private ListNode lastNode;
	private int nodeCapacity;
	public UnrolledLinkedList(int nodeCapacity) throws IllegalArgumentException {
		if(nodeCapacity < 8) {
			throw new IllegalArgumentException("nodeCapacity < 8");
		}
		this.nodeCapacity = nodeCapacity;
		firstNode = new ListNode();
		lastNode = firstNode;
	}
	
	public UnrolledLinkedList() {
		this(16);
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean contains(Object o) {
		return (indexOf(o) != -1);
	}
	// to end of list
	public boolean add(E e) {
		insertIntoNode(lastNode, lastNode.numElements, e);
		return true;
	}
	
	private void insertIntoNode(UnrolledLinkedList<E>.ListNode lastNode2, int numElements, E e) {
		
	}

	@Override
	public E get(int arg0) {
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	private class ListNode {
		ListNode next;
		ListNode previous;
		int numElements = 0;
		Object[] elements;
		public ListNode() {
			elements = new Object[nodeCapacity];
		}
	}
	
	private class ULLIterator implements ListIterator<E> {
		ListNode currentNode;
		int ptr;
		int index;
		private int expectedModCount = modCount;
		public void add(E e) {
			// TODO Auto-generated method stub
			
		}

		public boolean hasNext() {
			
			return (index < size-1);
		}

		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		public E next() {
			ptr++;
			if(ptr >= currentNode.numElements) {
				if(currentNode.next!= null) {
					currentNode = currentNode.next;
					ptr=0;
				}
			}
			return null;
		}

		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		public E previous() {
			// TODO Auto-generated method stub
			return null;
		}

		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void remove() {
			// TODO Auto-generated method stub
			
		}

		public void set(E e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
