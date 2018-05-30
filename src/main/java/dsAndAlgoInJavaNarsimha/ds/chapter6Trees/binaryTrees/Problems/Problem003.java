package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem-3: Give an algo to search an elem in Binary Tree.
 * Solution: Return a node if a node with data is found in tree. 
 * Recurse down the tree, choose the left or right branch by comparing
 * data with each nodes data.
 *  
 *  Time Complexity: O(n)
 *  Space Complexity: O(n)
 * @author ashi
 *
 */
public class Problem003 {
 public boolean findInBinaryTree(BinaryTreeNode root, int data) {
	if(root==null) {
		return false;
	}
	if(root.getData()==data) {
		return true;
	}
	return findInBinaryTree(root.getLeft(), data) || findInBinaryTree(root.getRight(), data);
 }
}
