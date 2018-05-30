package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-9: Can we solve Problem-7 using sorting technique?
 * Solution: No, Consider the following algo which is based on sorting and then,
 * we see why this algo fails
 * Algorithm:
 * 	a) Traverse the linked list and take all next pointers into some array
 * 	b) Sort the array that has next pointers
 * 	c) If there is loop in linked list, definitely two nodes next ptrs will be
 * 	   pointing to same node.
 * 	d) After sorting, if there is a loop in the list, the node whose 
 * 	   next pointers are same will come adjacent in the sorted list.
 * 	e) If any such pair exists in the sorted list then we say linked list 
 * 	   has loop in it.
 *  
 *  Time Complexity: O(nlogn) for sorting next pointers array.
 *  Space Complexity: O(n) for next pointers array.
 *  
 *  Problem: The above algo works only if we can find the length of list.
 *  But if list is having loop then we may end up in infinite loop. 
 *  Due to this reason algo fails.
 *  
 * @author ashi
 *
 */
class Problem009 {

}
