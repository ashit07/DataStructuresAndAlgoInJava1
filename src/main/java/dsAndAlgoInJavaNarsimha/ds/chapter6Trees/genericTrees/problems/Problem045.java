/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.genericTrees.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.genericTrees.impl.GenericTreeNode;

/**
 * Problem: Given a node in generic tree, find the number of siblings for that node.
 * Solution: Traverse all the nextSiblings
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * @author ashi
 * 
 */
public class Problem045 {
	public int siblingsCount(GenericTreeNode current) {
		int count = 0;
		while(current != null) {
			count++;
			current = current.getNextSibling();
		}
		return count;
	}
}
