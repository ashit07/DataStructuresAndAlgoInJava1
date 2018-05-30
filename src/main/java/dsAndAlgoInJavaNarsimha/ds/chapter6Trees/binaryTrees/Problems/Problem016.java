/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo for finding the number of leaves in BT without using
 * recursion.
 * Solution: The set of nodes whose both left and right children are NULL are
 * called leaf nodes.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem016 {
 public int numberOfLeavesInBTusingLevelOrder(BinaryTreeNode root) {
	 if(root==null) {
		 return 0;
	 }
	 int count=0;
	 Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode> ();
	 q.offer(root);
	 while(!q.isEmpty()) {
		 BinaryTreeNode tmp = q.poll();
		 if(tmp!=null) {
			 if(tmp.getLeft()==null && tmp.getRight()==null) {
				 count++;
			 }
			 if(tmp.getLeft()!=null) {
				 q.offer(tmp.getLeft());
			 }
			 if(tmp.getRight()!=null) {
				 q.offer(tmp.getRight());
			 }
		 }
	 }
	 return count;
 }
}
