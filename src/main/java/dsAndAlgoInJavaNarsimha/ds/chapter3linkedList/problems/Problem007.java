package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 *  
 * Problem-7: Check whether given linked list is either null-Terminated or
 * ends with a cycle.
 * 
 * Solution-7:  Brute-Force Approach: As an example, consider the following 
 * linked list which has a loop in it. The difference between this list and 
 * regular list is that, in this list there are two nodes whose next pointers are same.
 * In regular linked list, each nodes next pointer is unique. This means, repetition of
 * next pointer indicated existence of loop.
 * 
 * One simple and brute force way of solving this is, start with the first node and see whether
 * there is any node whose next pointer is current node's address. If there is a node
 * with same address then that indicates that some other node is pointing to the
 * current node and we say loop exists. Continue this process for all nodes.
 * 
 * As per algo, we are checking for next pointer addresses, but how do we find the end of
 * linked list (otherwise we may end in infinite loop)?
 *  
 * @author ashi
 *
 */
class Problem007 {
	

}
