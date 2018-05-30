/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo for printing all the ancestors of a node in a BT. 
 * 		For the tree below, for 6 the ancestors are 1 3 7.
 * Solution:
 * 					1
 * 				   / \
 * 				  2   3
 * 				 /\   /\
 *              4  5 6  7
 * 
 * Apart from the Depth First Search of this tree, we can use the foll recursive way to print the ancestors.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 * 
 */
public class Problem032 {
	public boolean printAllAncestors(BinaryTreeNode root, BinaryTreeNode node) {
		if(root==null) return false;
		if(root.getLeft() == node || root.getRight() == node || 
				printAllAncestors(root.getLeft(), node) || printAllAncestors(root.getRight(), node)) {
			System.out.println(root.getData());
			return true;
		}
		return false;
	}
}
