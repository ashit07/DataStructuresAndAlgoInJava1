package dsAndAlgoInJavaNarsimha.ds.chapter10Sorting.sortingTechniques;

/**
 * 
 */

/**
 * Problem:
 * Solution:
 * 
 * Time Complexity: worst case: O(n^2)
 * 					worst case: O(n^2)
 * 					worst case: O(n^2)
 * Space Complexity: worst case: O(n^2) total, O(1) auxiliary
 * @author ashi
 * 
 */
public class InsertionSort {
	public void performInsertionSort(int[] arrToSort) {
		int i, j, v;
		for(i=2; i<=arrToSort.length; i++) {
			v=arrToSort[i];
			j=i;
			while(arrToSort[j-1]>v && j>=1) {
				arrToSort[j]=arrToSort[j-1];
				j--;
			}
			arrToSort[j]=v;
		}
	}
}
