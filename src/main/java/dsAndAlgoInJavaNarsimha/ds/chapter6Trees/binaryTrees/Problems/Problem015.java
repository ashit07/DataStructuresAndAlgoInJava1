/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTree;
import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo for deleting an elem (assuming data is given) from BT.
 * Solution: The deletion of a node in binary tree can be implemented as:
 * a) Starting at root, find the node which we want to delete.
 * b) Find the deepest node in tree.
 * c) Replace the deepest nodes data with data to be deleted.
 * d) Then delete the deepest node.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem015 {
	public int deleteFromBinaryTree(BinaryTreeNode root, int data) {
		BinaryTree bt = new BinaryTree();
		BinaryTreeNode nodeToBeDeleted = bt.findInBinaryTreeLevelOrder(root, data);
		BinaryTreeNode deepestNode = bt.deepestNodeInBinaryTree(root);
		BinaryTreeNode tmp = nodeToBeDeleted;
		nodeToBeDeleted = deepestNode;
		deepestNode = null;
		return tmp.getData();		
	}
}
