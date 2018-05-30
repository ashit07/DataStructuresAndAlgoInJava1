package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-43: Is it possible to get O(1) access time for Linked Lists?
 * Solution: Yes, create a linked list at the same time keep it in hash table.
 * For n elements we have to keep all the elements into hash table which gives
 * pre-processing time of O(n). To read any element we require only constant
 * time O(1) and to read n elements we require n*1 unit of time = n units.
 * Hence by using amortized analysis we can say yhat element access can be 
 * performed within O(1) time.
 * Time Complexity: O(1) amortized
 * Space Complexity: O(n) for hash table.
 *  
 * @author ashi
 *
 */
public class Problem043 {

}
