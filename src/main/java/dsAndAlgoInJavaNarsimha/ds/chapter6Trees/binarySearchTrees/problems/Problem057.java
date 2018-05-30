/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.impl.BinarySearchTreeNode;

/**
 * Problem: Can we improve the complexity of Problem-56?
 * 
 * Solution:A better soln looks at each node only once. The trick is to write a utility
 * helper fn isBstUtil(BinaryTreeNode root, int min, int max) that traverses down the tree keeping track of 
 * narrowing min and max allowed values as it goes, looking at
 * each node only once. The initial vals for min and max shld be 
 * INT_MIN and INT_MAX - they narrow from there.
 * 
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 * @author ashi
 * 
 */
public class Problem057 {
	public boolean isBst(BinarySearchTreeNode root, int min, int max) {
		if(root==null) return true;
		return (root.getData()>min && 
					root.getData() <max && 
						isBst(root.getLeft(), min, root.getData())&& 
						isBst(root.getRight(), root.getData(), max));
	}
}
