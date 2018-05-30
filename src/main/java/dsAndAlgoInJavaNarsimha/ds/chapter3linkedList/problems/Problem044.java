package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.circularLinkedList.CLLNode;


/**
 * Problem-44: N people have decided to elect a leader by arranging themselves in 
 * a circle and eliminating every Mth person around the circle, closing ranks as
 * each person drops. Find out which person will be the last one 
 * remaining (with rank 1).
 * Solution: 	
 * Assume the input is a circular linked list with N nodes and 
 * each node has a number (range 1 to N) associated with it. 
 * The head node has number 1 as data.
 * 
 * @author ashi
 *
 */
public class Problem044 {
public CLLNode getJosephusPosition(int n, int m) {
	//Create a circular linked list
	CLLNode p= new CLLNode(1), q;
	q=p;
	for(int i=2;i<=n; ++i) {
		CLLNode temp = new CLLNode (i);
		p.setNext(temp);
		p=p.getNext();
	}
	p.setNext(q);
	Utility.displayLinkedList(p);
	for(int count=n; count>0; --count) {
		for(int i=0;i<m;i++) {
			p=p.getNext();
		}
		p.setNext(p.getNext().getNext());
	}
	return p;
}
public static void main(String[] args) {
	CLLNode leader = new Problem044().getJosephusPosition(10, 2);
	System.out.println(leader.getData());
}
}
