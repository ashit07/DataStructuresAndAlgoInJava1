package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * 
 * Problem-4: Give an algo for searching an elem in binary tree without recursion. 
 * Solution: Using level order traversal
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 *
 */
public class Problem004 {
public boolean findInBinaryTreeLevelOrder(BinaryTreeNode root, int data){
	if(root== null) {
		return false;
	}
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	q.offer(root);
	while(!q.isEmpty()) {
		BinaryTreeNode tmp = q.poll();
		if(tmp.getData() == data){
			return true;
		}
		if(tmp != null) {
			if(tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				q.offer(tmp.getRight());
			}
		}
	}
	return false;
}
}
