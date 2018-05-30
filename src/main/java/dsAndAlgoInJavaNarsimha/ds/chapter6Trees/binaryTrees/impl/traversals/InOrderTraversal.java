package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.traversals;

import java.util.ArrayList;
import java.util.Stack;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

public class InOrderTraversal {

	/**
	 * a) Traverse the left subtree in Inorder.
	 * b) Visit the root
	 * c) Traverse the right subtree in Inorder.
	 * @param root
	 */
	public void inorderTraversalRecursive(BinaryTreeNode root) {
		inorderTraversalRecursive(root.getLeft());
		System.out.println(root.getData());
		inorderTraversalRecursive(root.getRight());
	}
	/**
	 * Similar to Preorder. The only chnge is, instead of processing node before
	 * going to left subtree, process it after popping (which indicates after 
	 * processing of left subtree) 
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> inorderTraversalIterative(BinaryTreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode current = root;
		boolean done = false;
		while(!done) {
			if(current != null) {
				s.push(current);
				current = current.getLeft();
			} else {
				if(s.isEmpty()) {
					done = true; 
				} else {
					current = s.pop();
					res.add(current.getData());
					current = current.getRight();
				}
			}
		}
		return res;
	}
}
