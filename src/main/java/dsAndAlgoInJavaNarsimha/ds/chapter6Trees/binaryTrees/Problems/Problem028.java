/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Given 2 trees, give an algo for checking whether they are mirrors of each other.
 * Solution:
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 * 
 */
public class Problem028 {
	public boolean areMirrors(BinaryTreeNode root1, BinaryTreeNode root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1==null || root2==null) {
			return false;
		}
		if(root1.getData()!=root2.getData()) {
			return false;
		}
		return (areMirrors(root1.getLeft(), root2.getRight())&&areMirrors(root1.getRight(), root2.getLeft()));
	}
}
