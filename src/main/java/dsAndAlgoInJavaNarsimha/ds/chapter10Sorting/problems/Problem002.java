/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter10Sorting.problems;

/**
 * Problem: Can we improve the complexity of problem-2?
 * Solution: Yes, using sorting technique, Heapsort will be used as it takes O(nlogn) time and
 * requires O(1) space.
 * 
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1)
 * @author ashi
 * 
 */
public class Problem002 {
	public boolean checkDuplicatesInArr(int[] arr){
	//	Heapsort(arr); Compulsory, uncomment after heapsort is implemented
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
		}
		return false;
	}
}
