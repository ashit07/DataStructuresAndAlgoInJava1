package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * 
 * Problem: Give an algo for inserting elem in binary tree
 * 
 * Solution: Since this is a binary tree, we can insert the elem wherever we 
 * want. To insert an elem, we can use the level order traversal and insert the
 * elem wherever we found the node whose left or right child is null.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 *
 */
public class Problem005 {
public BinaryTreeNode insertInBinaryTreeIterative(BinaryTreeNode root, int data){
	if(root==null) {
		return null;
	}
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	q.offer(root);
	while(!q.isEmpty()) {
		BinaryTreeNode tmp = q.poll();
		if(tmp!=null) {
			if(tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			} else {
				tmp.setLeft(new BinaryTreeNode(data));
				return root;
			}
			if(tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			} else {
				tmp.setRight(new BinaryTreeNode(data));
				return root;
			}
		}
	}
	return root;
}
public BinaryTreeNode insertInBinaryTreeRecurive(BinaryTreeNode root, int data) {
	if(root == null) {
		return null;
	} 
	insertHelper(root, data);
	return root;
}
private void insertHelper(BinaryTreeNode root, int data) {
	if(root.getData()>= data) {
		if(root.getLeft()==null) {
			root.setLeft(new BinaryTreeNode(data));
		} else {
			insertHelper(root.getRight(), data);
		}
	} else {
		if(root.getRight()==null) {
			root.setRight(new BinaryTreeNode(data));
		} else {
			insertHelper(root.getLeft(), data);
		}
	}
}
}
