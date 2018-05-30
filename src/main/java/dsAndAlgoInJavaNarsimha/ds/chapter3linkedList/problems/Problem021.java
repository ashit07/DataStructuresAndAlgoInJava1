package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-21: Can we use stacks for Problem-18?
 * Solution: 
 * Algorithm
 * a) Create two stacks: one for first list and one for second list.
 * b) Traverse the first list and push all the nodes on first stack.
 * c) Traverse the second list and push all the nodes on second list.
 * d) Now, compare the top node addresses of both stacks.
 * e) If they r same, pop the top elements from both the stacks and keep it in 
 * 	  some temp variable (since both the same, only one temp will be okay).
 * f) Continue this until the top node addresses of stack are not same.
 * h) This point is the one where the lists merge into single linked list.
 * i) Return the value of temp variable.
 *
 *Time Complexity: O(m+n) for scanning both lists.
 *Space Complexity: O(m+n) for creating 2 stacks.
 * @author ashi
 *
 */
public class Problem021 {

}
