package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem -18: Suppose there are 2 linked lists both of which intersect at some point and
 * become a single linked list. The head or start pointers of both the 
 * linked lists are known, but the intersecting node is not known.
 * Also, the number of nodes in each of the list before they intersect are
 * unknown and both the lists may have it different.
 * List1 may have n nodes before it reaches intersection pt and List2 may
 * have m nodes before it reaches intersection pt where m and n may be 
 * m=n, m<n or m>n.
 * 	List1:			9->12->78->57->28->96->null
 * 						^
 * 						|
 * 	List2:	15->45->43->67	
 * 
 * Give an algo to find the merging pt (in the above case 12). 
 * 
 * Solution:
 * Brute-Force approach: One easy solution is to compare every node ptr in 
 * first list with every other node ptr in second list by which the atching node ptrs 
 * will lead us to the intersecting node. But the time complexity will be
 * O(mn) which will be very high. 
 * 
 * Time Complexity: O(mn)
 * Space Complexity: O(1)
 * 
 * Note: For best solution check problem024 
 * 
 * @author ashi
 *
 */
public class Problem018 {

}
