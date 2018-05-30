/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: F=given two binary trees, return true if they are structurally
 * identical.
 * Solution:
 * Algo: 
 * a) If both trees are Null then return true;
 * b) If both trees are not Null, then recursively check left and right subtree
 * structures.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem019 {
	public boolean checkStructurallySameTrees(BinaryTreeNode root1, BinaryTreeNode root2) {
		if(root1==null && root2 == null) {
			return true;
		}
		if(root1==null || root2 == null) {
			return false;
		}
		return checkStructurallySameTrees(root1.getLeft(), root2.getRight()) &&
				checkStructurallySameTrees(root1.getRight(), root2.getLeft());
	}
}
