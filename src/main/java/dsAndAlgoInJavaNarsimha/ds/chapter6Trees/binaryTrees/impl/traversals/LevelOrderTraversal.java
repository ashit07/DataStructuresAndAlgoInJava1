package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

public class LevelOrderTraversal {
/**
 * a) Visit the root
 * b) While traversing lvl 1, keep all the elems at lvl l+1 in queue.
 * c) Go to next lvl and visit all nodes at that lvl.
 * d) Repeat this until lvls are completed.
 * 	
 * @param root
 * @return
 */
public 	ArrayList<Integer> levelOrderTraversal(BinaryTreeNode root) {
	ArrayList<Integer> res=new ArrayList<Integer>();
	if(root == null) {
		return res;
	}
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	q.offer(root);
	q.offer(null);
	ArrayList<Integer> curr=new ArrayList<Integer>();
	while(!q.isEmpty()){
		BinaryTreeNode tmp = q.poll();
		if(tmp!=null) {
			curr.add(tmp.getData());
			if(tmp.getLeft()!=null) {
				q.offer(tmp.getLeft());
			}
			if(tmp.getRight()!=null) {
				q.offer(tmp.getRight());
			}
		} else {
			ArrayList<Integer> currCopy=new ArrayList<Integer>(curr);
			res.addAll(currCopy);
			curr.clear();
			if(!q.isEmpty()) {
				q.offer(null);
			}
		}
	}
	return res;
}

}
