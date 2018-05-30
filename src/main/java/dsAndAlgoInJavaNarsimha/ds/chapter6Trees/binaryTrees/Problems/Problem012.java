/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Can we solve problem-12 without recursion?
 * Solution: Using level order traversal. This is similar to BSF of graph algo.
 * End of level is identified as null.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem012 {
	public int maxDepth(BinaryTreeNode root) {
		if(root == null) {
			return 0;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		int count=1;
		while(!q.isEmpty()){
			BinaryTreeNode curr = q.poll();
			if(curr != null) {
				if(curr.getLeft()== null && curr.getRight() == null) {
					return count;
				}
				if(curr.getLeft()!=null) {
					q.offer(curr.getLeft());
				}
				if(curr.getRight()!=null) {
					q.offer(curr.getRight());
				}
			} else {
				if(!q.isEmpty()) {
					count++;
					q.offer(null);
				}
			}
		}
		return count;
	}
}
