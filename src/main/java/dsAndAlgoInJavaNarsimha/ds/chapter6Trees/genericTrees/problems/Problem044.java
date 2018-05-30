/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.genericTrees.problems;

/**
 * Problem: Given a parent array P, where P[i] indicates the parent of ith node in the tree 
 * (assume parent of root node is indicated with -1). Give an algo to find the height or depth of the tree.
 * 
 * Solution: From the problem description, the given arr represents the parent array. That means,
 * we need to consider the tree for that array and find the depth of the tree.
 * For example, if P is 	-1 0 1 6 6 0 0 2 7
 * 				 			 0 1 2 3 4 5 6 7 8 
 * Its corresponding tree is:
 * 									    0
 * 									   /|\
 *									  5	1 6
 *									   /
 * 									  2
 *									 /
 * 								    7
 *								   /
 *								  8								   	
 * The depth of tree is 4. If we carefully observe, we just need to start at every node and keep going to its parent until
 * we reach -1 and also keep track of the max depth among all the nodes.
 * Time Complexity:  O(n^2) as for skew trees we will be calculating the same values again and again.
 * Space Complexity: O(1)
 * 
 * Note: We can reduce the time complexity by storing the previously calculated nodes depth in some hashtable or other array.
 * This reduces time complexity but uses extra space.
 * @author ashi
 * 
 */
public class Problem044 {
	public int findDepthInGenericTree(int[] P) {
		int maxDepth=-1, currentDepth=-1, j;
		for(int i=0; i<P.length; i++) {
			currentDepth = 0; j=i;
			//Assuming root node is indicated with -1
			while(P[i] != -1) {
				currentDepth++;
				j=P[j];
			}
			if(currentDepth>maxDepth) {
				maxDepth = currentDepth;
			}
		}
		return maxDepth;
	}
}
