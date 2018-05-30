/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.impl.BinarySearchTreeNode;

/**
 * Problem : Given ptrs to two nodes in a BST, find lowest common ancestor (LCA). 
 * 			 Assume that both values already exist in the tree.
 * Solution: The main idea of the solution is: while traversing BST from root to bottom, 
 * 			 the first node we encounter with value a and b, i.e., a<node.data<b is the LCA of a and b (where a<b).
 * 			 So, just traverse the BST in pre-order, if we find a node with value in between a and b then that node is
 * 			 LCA. Is its val is greater than both a and b, it lies on left side of node and
 * 			 if its val is smaller than both a and b, then LCA lies on right side.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem054 {
	public BinarySearchTreeNode findLCA(BinarySearchTreeNode root, BinarySearchTreeNode a, BinarySearchTreeNode b) {
		if(root==null) return root;
		if(root==a || root==b) {
			return root;
		}
		if(Math.max(a.getData(), b.getData()) < root.getData()) { // a.getData() < root.getData() && a.getData() < root.getData() 
			return findLCA(root.getLeft(), a, b);
		} else if(Math.min(a.getData(), b.getData())> root.getData()) { // a.getData() > root.getData() && a.getData() > root.getData()
			return findLCA(root.getRight(), a, b);
		} else {
			return root;
		}
	}
}
