package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem-1: Give an algo to find max elem in binary tree.
 * Solution: One simple way of doing this is to find max elem in left subtree,
 * find max elem in right subtree and then, compare them with root data and select
 * the one giving max value. This can be done using recursion.
 * 
 * Time complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 *
 */
public class Problem001 {
 public int maxValueInBinaryTree(BinaryTreeNode root) {
	 int maxValue = Integer.MIN_VALUE;
	 if(root != null) {
		 int leftMax = maxValueInBinaryTree(root.getLeft());
		 int rightMax = maxValueInBinaryTree(root.getRight());
		 if(leftMax > rightMax) {
			 maxValue = leftMax;
		 } else {
			 maxValue = rightMax;
		 }
		 if(root.getData() > maxValue) {
			 maxValue = root.getData();
		 }
	 }
	 return maxValue;
 }
}
