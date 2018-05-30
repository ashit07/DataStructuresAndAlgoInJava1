/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo to find the height (depth) of binary tree.
 * Solution: Recursively cal the height of both left and right subtrees of a node
 * and assign height to the node as max of the heights of two children plus 1.
 * This is similar to preorder traversal.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem010 {
 public int maxDepthRecursion(BinaryTreeNode root){
	 if(root == null) {
		 return 0;
	 }
	 int leftDepth = maxDepthRecursion(root.getLeft());
	 int rightDepth = maxDepthRecursion(root.getRight());
	 return (leftDepth > rightDepth) ? leftDepth+1: rightDepth+1;
 }
}
