/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Can we solve Problem-25 without recursion?
 * Solution: We can use level order traversal with simple change. Every time after deleting an elem from queue,
 * add the nodes data val to sum var.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 * 
 */
public class Problem026 {
	public int sumAllElemsInBTs(BinaryTreeNode root) {
		if(root==null) return 0;
		int sum=0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			sum += tmp.getData();
			if(tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}
			if(tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			}
		}
		return sum;
	}
}
