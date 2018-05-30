/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.Problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl.BinaryTreeNode;

/**
 * Problem: Given a BT, print out all its root to leaf paths.
 * Solution: 
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class Problem023 {
	public void printPaths(BinaryTreeNode root) {
		int[] path = new int[256];
		printPaths(root, path, 0);
	}

	/**
	 * @param root
	 * @param path
	 * @param i
	 */
	private void printPaths(BinaryTreeNode root, int[] path, int pathLen) {
		if(root == null) {
			return;
		}
		//append this node to path array
		path[pathLen] = root.getData();
		pathLen++;
		if(root.getLeft()==null && root.getRight()==null) {
			printArray(path);
		} else {
			printPaths(root.getLeft(), path, pathLen);
			printPaths(root.getRight(), path, pathLen);
		}
		
		
	}

	/**
	 * @param path
	 */
	private void printArray(int[] path) {
		for(int i=0; i<path.length; i++) {
			System.out.print(path[i]+" ");
		}
		System.out.println("");
	}
}
