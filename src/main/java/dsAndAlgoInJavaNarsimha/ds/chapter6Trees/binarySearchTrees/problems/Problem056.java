/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTree;
import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem:  Can we think of getting the correct algo?
 * Solution: For each node, check if max val in left subtree is smaller than 
 * 			 the current node data and min val in right subtree greater than node data. 
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 * @author ashi
 * 
 */
public class Problem056 {
	public boolean isBST(BinaryTreeNode root) {
		if(root==null) return true;
		// false if the max of left is > than us.
		if(root.getLeft() !=null && BinaryTree.maxInBineryTreeLevelOrder(root.getLeft()) > root.getData()) {
			return false;
		}
		// false if the min of right is <= than us.
		if(root.getRight() !=null && BinaryTree.maxInBineryTreeLevelOrder(root.getRight()) < root.getData()) {
			return false;
		}
		if(!isBST(root.getLeft()) || !isBST(root.getRight())) {
			return false;
		}
		//passing all that it is binary
		return true;
		
	}
}
