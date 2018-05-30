package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-23: Can we still think of an alternate solution for problem-18?
 * Solution: Be combining sorting and searching technique, we can reduce the 
 * 	complexity.
 * Algo:
 * a) Create an arr A and keep all the next ptrs of first list in array.
 * b) Sort these arr elements.
 * c) Then, for each of second list element, search in sorted arr (let us assume
 * 		we are using binary search which gives O(logn))
 * d) Since we are scanning the second list one by one, the first repeating element
 * 		that comes is the merging point.
 * 
 * Time Complexity: Time for sorting + Time for searching=O(Max(nlogn,mlogm))
 * Space Complexity: O(max(n,m))
 * @author ashi
 *
 */
public class Problem023 {

}
