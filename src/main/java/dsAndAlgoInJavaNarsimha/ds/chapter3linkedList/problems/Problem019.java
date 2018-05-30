package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-19: Can we solve Problem-18 using sorting technique?
 * 
 * Solution: No, Consider the following algo and see why this fails.
 * 	Algorithm:
 * 	a)	Take first list node ptrs and keep in some array and sort them.
 * 	b)	Take second list node ptrs and keep in some array and sort them.
 * 	c)	After sorting, use two indexes: one for first sorted array and second for
 * 		second sorted array.
 * 	d)	Start comparing values at indexes and increment the index whichever has
 * 		lower value (increment only if values are not equal).
 * 	e)	At any point, if we were able to find two indexes whose values are
 * 		same, then that indicates that those two nodes are pointing to same node
 * 		and we return that node.
 * 	Time complexity:  Time for sorting lists + Time for scanning (for comparing)
 * 					  O(mlogm)+O(nlogn)+O(m+n)
 * 	We need to consider one which gives max value.
 * 	Space Complexity: O(1)
 * 
 * Problem with algo : In the algo, we are storing all the node ptrs of both 
 * 	the lists and sorting. But we ae forgetting the fact that, 
 * 	there can be repeated elements. This is because after the merging pt all node
 * 	pointers are same for both the lists. The algo works fine only in one case and 
 * 	it is when both lists have ending nodes at their merge point.
 * 
 * @author ashi
 *
 */
public class Problem019 {

}
