package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-20: Can we solve Problem-18 using hashing?
 * Solution: Yes, 
 * Algorithm
 * a) Select a list which have less number of nodes (or select list randomly incase 
 * 	  length is not known).
 * b) Now, traverse the other list and for each node ptr of this list check whether
 * 	  the same entry exists in hashtable.
 * c) If there is a merger ptr for given lists, then we will definately encounter
 * 	  the node ptr in hash table.
 * 
 * Time Complexity: Time for creating hash table + Time for scanning the
 * 					second list=O(m)+O(n)(or O(n)+O(m), depends on which list we 
 * 					select for hashtable.)
 * Space Complexity: O(n) or O(m)
 * 					 	
 * 
 * @author ashi
 *
 */
public class Problem020 {
	
}
