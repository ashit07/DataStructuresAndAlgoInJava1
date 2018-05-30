/**
 *
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo to check whether given BT is a BST or not.
 * Solution: For each node, check if node on its left is smaller and node on its right is greater
 *
 * Time Complexity:
 * Space Complexity:
 *
 * This approach is wrong as this will return true for BT below. Checking only at current node is not enough.
 * 					root -> 6
 * 						   / \
 * 					      2   8
 * 						 / \
 * 						1   9
 *
 * @author ashi
 *
 */
public class Problem055 {
	public boolean isBst(BinaryTreeNode root) {
			if(root==null) return true;
			if(root.getLeft()!=null &&  root.getLeft().getData() > root.getData()){
				return false;
			}
			if(root.getRight()!=null && root.getRight().getData() <root.getData()){
				return false;
			}
			if(!isBst(root.getLeft()) || !isBst(root.getRight())) {
				return false;
			}
			return true;
	}
}
