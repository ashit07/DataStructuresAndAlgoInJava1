package dsAndAlgoInJavaNarsimha.ds.chapter3linkedList.problems;
/**
 * Problem-3:   Can we improve the complexity of Problem-2?
 * Solution:	Yes, using HashTable.
 * In this approach, create a hashtable whose entries are <position of node, node address> i.e. key is position of node in list
 * and value is address of that node.
 * Let us say, length of list is M. To find nth node from end, we can convert this to M-n+1th from the beginning.
 * Time complexity: O(m)
 * Space Complexity: O(m) for creating a hash table of size m.
 * @author ashi
 */
class Problem003 {

}
