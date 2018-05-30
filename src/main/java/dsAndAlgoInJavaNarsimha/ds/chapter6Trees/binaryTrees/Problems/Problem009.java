/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo for printing the level order data in reverse order.
 * Solution: For example, the output of the foll tree should be: 4 5 6 7 2 3 1
 * 
 * 				1
 * 			   / \	
 * 			  2   3
 * 			 /\   /\
 *          4  5 6  7

 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem009 {
	public void levelOrderTraversalReverse(BinaryTreeNode root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()) {
			BinaryTreeNode tmp = q.poll();
			if(tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}
			if(tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			}
			s.push(tmp);
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop().getData()+" ");
		}
	}
}
