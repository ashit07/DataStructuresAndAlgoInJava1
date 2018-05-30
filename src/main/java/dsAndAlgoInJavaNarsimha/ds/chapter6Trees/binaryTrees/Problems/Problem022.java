/**
 *
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Give an algo to find the lvl that has max sum in BT
 * Solution: The logic is similar to finding number of lvls.
 *  The only change is, we need to keep track of sums as well.
 *
 * Time Complexity:
 * Space Complexity:
 * @author ashi
 *
 */
public class Problem022 {
	public int findLevelWithMaxSum(BinaryTreeNode root){
		int maxSum=0, currentSum=0;
		if(root == null) {
			return 0;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if(tmp!=null) {
				currentSum+=tmp.getData();
				if(tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight()!=null){
					q.offer(tmp.getRight());
				}
			} else {
				if(currentSum> maxSum) {
					maxSum = currentSum;
				}
				currentSum=0;
				if(!q.isEmpty()){
					q.offer(null);
				}
			}
		}
		return maxSum;
	}
}
