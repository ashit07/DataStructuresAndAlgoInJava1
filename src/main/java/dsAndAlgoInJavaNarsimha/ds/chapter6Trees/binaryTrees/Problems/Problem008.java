/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.Stack;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Given an algo for deleting the tree.
 * Solution: To delete a tree we must traverse through all the nodes of the tree
 * and delete them one by one. Before deleting the parent node we should del 
 * children nodes first. We can use postorder traversal here as it does the wrk
 * without storing anything. We can delete tree with other traversals also
 * with extra space complexity.
 * 				1
 * 			   / \	
 * 			  2   3
 * 			 /\ 
 *          4  5
 * 
 * So, the deleted order will be 4,5,2,3,1
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem008 {
	public void deleteBinaryTree(BinaryTreeNode root) {
		if(root==null) {
			return;
		}
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		BinaryTreeNode prev=null;
		while(!s.isEmpty()){
			BinaryTreeNode curr = s.peek();
			if(prev == null || prev.getLeft()==curr || prev.getRight()==curr) {
				if(curr.getLeft()!=null) {
					s.push(curr.getLeft());
				} else if(curr.getRight()!=null) {
					s.push(curr.getRight());
				}
			} else if(curr.getLeft()==prev) {
				if(curr.getRight()!=null) {
					s.push(curr.getRight());
				}
			} else {
				deleteNode(curr);
				s.pop();
			}
			prev=curr;
		}
	}
	private void deleteNode(BinaryTreeNode root) {
		root=null;
	}
}
