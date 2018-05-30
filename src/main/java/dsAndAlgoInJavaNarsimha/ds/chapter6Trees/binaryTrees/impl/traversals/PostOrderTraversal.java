package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.traversals;

import java.util.ArrayList;
import java.util.Stack;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

public class PostOrderTraversal {
/**
  * 1. Traverse the left subtree in Postorder.
  * 2. Traverse the right subtree in Postorder.
  * 3. Visit the root.
 * @param root
 */
	public void postorderTraversalRecursive(BinaryTreeNode root) {
		postorderTraversalRecursive(root.getLeft());
		postorderTraversalRecursive(root.getLeft());
		System.out.println(root.getData());
	}
	/**
	 * In inorder and preorder, after poppong the stack elem we do not need to
	 * visit the same vertex again. But in postfix, each node is visited twice.
	 * That means, after processing left subtree we will visit curr node and 
	 * process right subtree and again visit curr node. But we shld be 
	 * processing the node during second visit.
	 * Trick is that after popping an elem from stack, check whether that elem and
	 * right of top of stack are same or not. If same, then we have completed the
	 * process of left subtree and right subtree. In this case, we just need to
	 * pop the stack one more time and print its data.
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> postorderTraversaliterative(BinaryTreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode> ();
		s.push(root);
		BinaryTreeNode prev = null;
		while(!s.isEmpty()) {
			BinaryTreeNode curr = s.peek();
			if (prev == null || prev.getLeft() == curr || prev.getRight() == curr) {
				//traverse from top to bottom, and if curr has left child or
				//right child, push onto stack, else pop out.
				if(curr.getLeft()!=null) {
					s.push(curr.getLeft());
				} else if(curr.getRight()!=null) {
					s.push(curr.getRight());
				}
			} else if(curr.getLeft() == prev) {
				if(curr.getRight()!=null) {
					s.push(curr.getRight());
				}
			} else {
				res.add(curr.getData());
				s.pop();
			}
			prev=curr;
		}
		return res;
	}
 	
} 
