/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo to find the deepest node of binary tree.
 * Solution: The last node processed from queue in level order is the 
 * deepest node in binary tree.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem014 {
public BinaryTreeNode deepestNodeInBinaryTree(BinaryTreeNode root){
	if(root == null) {
		return null;
	}
	BinaryTreeNode curr = null;
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode> ();
	q.offer(root);
	while(!q.isEmpty()) {
		curr = q.poll();
		if(curr!=null) {
			if(curr.getLeft()!=null) {
				q.offer(curr.getLeft());
			}
			if(curr.getRight()!=null) {
				q.offer(curr.getRight());
			}
		}
	}
	return curr;
}
}
