/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an  algo for finding the min depth of binary tree.
 * Solution:
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem013 {
	public int minDepth(BinaryTreeNode root) {
		if(root==null) {
			return 0;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		int count=1;
		while(!q.isEmpty()){
			BinaryTreeNode curr = q.poll();
			if(curr !=null) {
				if(curr.getLeft()== null && curr.getRight()==null) {
					return count;
				}
				if(curr.getLeft()!=null) {
					q.offer(curr.getLeft());
				}
				if(curr.getRight()!=null) {
					q.offer(curr.getRight());
				}
			} else {
				if(!q.isEmpty()){
					count++;
					q.offer(null);
				}
			}
		}
		return count;
	}
}
