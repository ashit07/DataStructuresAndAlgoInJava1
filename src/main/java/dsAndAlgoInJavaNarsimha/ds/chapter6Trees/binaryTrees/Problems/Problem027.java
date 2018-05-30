/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo for converting a tree to its mirror. Mirror of a tree is another tree with
 * left and right children of all non-leaf nodes interchanged. The trees below are mirrors to each other.
 * Solution:	1					1
 * 			   / \				   / \
 *            2   3				  3   2
 *           /\    					  /\
 * 			4  5					 5	4
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem027 {
	public BinaryTreeNode mirrorOfBinaryTree(BinaryTreeNode root){
		BinaryTreeNode tmp;
		if(root != null) {
			mirrorOfBinaryTree(root.getLeft());
			mirrorOfBinaryTree(root.getRight());
			tmp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(tmp);
		}
		return root;
	}
}
