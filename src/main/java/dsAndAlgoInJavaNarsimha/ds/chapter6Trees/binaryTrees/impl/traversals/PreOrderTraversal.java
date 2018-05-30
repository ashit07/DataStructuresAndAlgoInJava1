package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.traversals;

import java.util.ArrayList;
import java.util.Stack;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * 
 * @author ashi
 *
 */
public class PreOrderTraversal {
 /**
  * 
  * 1. Visit the root.
  * 2. Traverse the left subtree in Preorder.
  * 3. Traverse the right subtree in Preorder.
  * @param root
  */
	public void preOrderRecursive(BinaryTreeNode root) {
		if(root != null) {
			System.out.println(root.getData());
			preOrderRecursive(root.getLeft());
			preOrderRecursive(root.getRight());
		}
	}
	/**
	 * 
	 * In iterative version, a stack is needed to remember the curr node so that
	 * after completing the left subtree we can go to right subtree. First we
	 * process the curr node and before going to left subtree, we store the
	 * curr node on stack. After completing the left subtree, we pop the elem from
	 * stack and go to its right subtree. Continue this process until stack is
	 * non-empty.
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> preOrderIterative(BinaryTreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null) {
			return res;
		}
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode> ();
		s.push(root);
		while(!s.isEmpty()) {
			BinaryTreeNode tmp = s.pop();
			res.add(tmp.getData());
			
			if(tmp.getRight() != null) {
				s.push(tmp.getRight());
			}
			if(tmp.getLeft() != null) {
				s.push(tmp.getLeft());
			}
		}
		return res;
	}
}
