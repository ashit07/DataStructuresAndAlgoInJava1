/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Can we solve Problem006 (size of BT) without recursion?
 * Solution: Yes, using level order traversal
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * @author ashi
 * 
 */
public class Problem007 {
public int size(BinaryTreeNode root){
	int count=0;
	if(root== null) {
		return 0;
	}
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	q.offer(root);
	while(!q.isEmpty()){
		BinaryTreeNode tmp = q.poll();
		count++;
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
