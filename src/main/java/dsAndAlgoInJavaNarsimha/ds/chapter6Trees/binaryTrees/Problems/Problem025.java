/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Given an algo for finding the sum of all elems in BT.
 * Solution: Recursively, call left subtree, right subtree and add their vals to current nodes data.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 */
public class Problem025 {
	public int addBT(BinaryTreeNode root) {
		if(root==null) return 0;
		return (root.getData()+addBT(root.getLeft())+ addBT(root.getRight()));
	}
}
