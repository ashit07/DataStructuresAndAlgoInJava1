package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.LinkedList;
import dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.singlyLinkedList.ListNode;

/**
 * Problem-24: Can we improve the complexity for Problem-18?
 * Solution: yes, Efficient Approach
 * a) Find lengths(L1 and L2) of both the lists -- O(n)+O(m) =O(max(n,m))
 * b) Calculate the difference d of lengths -- O(1)
 * c) Make d steps in longer list -- O(d)
 * d) Step in both the nodes in parallel until links to both nodes match. -- O(min(m,n)
 * 
 *  Total time Complexity: O(max(m,n))
 *  Space Complexity: O(1)
 *  
 * @author ashi
 *
 */
public class Problem024 {

	public ListNode findIntersectingNode(ListNode list1, ListNode list2) {
		int l1=0, l2=0, diff=0;
		ListNode head1=list1, head2=list2;
		while(head1 != null) {
			l1++;
			head1=head1.getNext();
		}
		while(head2 != null) {
			l2++;
			head2=head2.getNext();
		}
		if(l1>l2) {
			head1=list1;
			head2=list2;
			diff = l1-l2;
		} else {
			head1=list2;
			head2=list1;
			diff=l2-l1;
		}
		for(int i=0; i<diff; i++) {
			head1=head1.getNext();
		}
		while(head1 !=null && head2 != null) {
			if(head1== head2) {
				return head1;
			}
			head1=head1.getNext();
			head2=head2.getNext();
		}
		return null;
	}

	public static void main(String[] args) {
		LinkedList list1 = Utility.getDummylinkedList(10);
		LinkedList list2 = Utility.getDummylinkedList(5);
		
		ListNode list1Node = list1.getNode(3);
		ListNode list2Node = list2.getNode(5);
		list2Node.setNext(list1Node);
		
		
		ListNode intersecting = new Problem024().findIntersectingNode(list1.getHead(), list2.getHead());
		System.out.println(list2.toString());
		System.out.println(intersecting.getData());
	}
}
