package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem:Give an algo for finding the diameter of BT. The diameter of tree 
 * (sometimes called the width) is the number of nodes on the longest path between two leaves in the tree.
 * Solution:To find the diameter of a tree, first calculate the diameter of left subtree and right subtree
 * recursively. Among these two vals, we need to send the max val along with current val (+1).
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem020 {
	private int diameter =0;
	public int diameterOfTree(BinaryTreeNode root) {
		int left, right;
		if(root==null) {
			return 0;
		}
		left = diameterOfTree(root.getLeft());
		right = diameterOfTree(root.getRight());
		if(left+right > diameter) {
			diameter = left + right;
		}
		return Math.max(left, right)+1;
	}
	
	//Alternate way
	public int diameter (BinaryTreeNode root) {
		if(root == null) return 0;
		int len1 = height(root.getLeft()) + height(root.getRight())+3;
		int len2 = Math.max(diameter(root.getLeft()), diameter(root.getRight()));
		return Math.max(len1, len2);
		
	}
	public int height(BinaryTreeNode root){
		if(root == null) return 0;
		int leftDepth = height(root.getLeft());
		int rightDepth = height(root.getRight());
		return (leftDepth>rightDepth) ? leftDepth +1 : rightDepth +1;
	}
}
