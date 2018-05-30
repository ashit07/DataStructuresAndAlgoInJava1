package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * 
 * Problem:Give an algo for finding the size of binary tree.
 * Solution: Cal the size of left anf right subtrees recursively, add 1 (curr node)
 * and return to its parent.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 *
 */
public class Problem006 {

	public int sizeRecursive(BinaryTreeNode root) {
		int leftCount = root.getLeft()==null? 0: sizeRecursive(root.getLeft());
		int rightCount = root.getRight()==null? 0: sizeRecursive(root.getRight());
		return 1+leftCount+rightCount;
	}
}
