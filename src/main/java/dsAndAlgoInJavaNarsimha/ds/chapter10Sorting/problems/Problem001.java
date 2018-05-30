/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter10Sorting.problems;

/**
 * Problem: Given an array A[0...n-1] of n numbers containing repetition of some number, give an algo for checking
 * whether there are repeated elements or not. Assume that we are not allowed to use additional space (i.e., 
 * we can use a few temporary variables, O(1) storage  
 * 
 * Solution: Since we are not allowed to use any extra space, one simple way is to scan the elems one by one 
 * 	and for each elem check whether that elems appears in the remaining elems. If we find a match we return true
 * 
 * Time Complexity: O(n^2) 
 * Space Complexity: O(1)
 * @author ashi
 * 
 */
public class Problem001 {
	public boolean checkDuplicatesInArr(int arr[], int n) {
		for(int i=0; i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
