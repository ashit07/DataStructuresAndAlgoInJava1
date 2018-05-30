package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem-2: Give an algo to find the max elem in binary tree without recursion/
 * Solution: Using level order traversal just observe the elements data while 
 * 			 deleting.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 *
 */
public class Problem002 {
public int maxInBineryTreeLevelOrder(BinaryTreeNode root) {
	if(root == null) {
		return Integer.MIN_VALUE;
	}
	int max = Integer.MIN_VALUE;
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	q.offer(root);
	while(!q.isEmpty()) {
		BinaryTreeNode tmp = q.poll();
		if(tmp.getData() > max) {
			max = tmp.getData();
		}
		if(tmp != null) {
			if(tmp.getLeft() != null) {
				q.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				q.offer(tmp.getLeft());
			}
		}
	}
	return max;
}
}
