/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.Stack;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Can we solve problem-10 using stack?
 * Solution: We can use stack to simulate recursion.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem011 {
public int maxDepthIterativeStack(BinaryTreeNode root) {
	if(root == null) {
		return 0;
	}
	Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
	s.push(root);
	int maxDepth =0;
	BinaryTreeNode prev=null;
	while(!s.isEmpty()) {
		BinaryTreeNode curr = s.peek();
		if(prev==null || prev.getLeft()==curr || prev.getRight()==curr) {
			if(curr.getLeft() != null) {
				s.push(curr.getLeft());
			} else if(curr.getRight() != null) {
				s.push(curr.getRight());
			}
		} else if( curr.getLeft()==prev) {
			if(curr.getRight()!=null)
				s.push(curr.getRight());
		} else {
			s.pop();
		}
		prev=curr;
		if(s.size()>maxDepth) {
			maxDepth=s.size();
		}
	}
	return maxDepth;
}
}
