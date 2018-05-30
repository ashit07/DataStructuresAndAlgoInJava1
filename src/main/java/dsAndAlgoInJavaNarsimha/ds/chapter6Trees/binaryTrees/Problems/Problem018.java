/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo for finding the number of half nodes (nodes with only
 * one child) in the BT without using recursion.
 * Solution: The set of all nodes with either left or either right child (but not
 * both) are called half nodes.
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem018 {
	public int numberOfHalfnodesInBTUsingLevelOrder(BinaryTreeNode root){
		if(root == null) {
			return 0;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		int count =0;
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if((tmp.getLeft() != null && tmp.getRight() == null) || 
					(tmp.getLeft() == null && tmp.getRight() != null)) {
				count++;
			}
			if(tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}
			if(tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			}
		}
		return count;
	}
}
