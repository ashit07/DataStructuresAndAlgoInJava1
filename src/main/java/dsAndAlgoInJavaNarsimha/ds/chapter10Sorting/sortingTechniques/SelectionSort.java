/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter10Sorting.sortingTechniques;

/**
 * Problem:
 * Solution:
 * 
 * Time Complexity:  worst case: O(n^2)
 * 					 average case: O(n^2)
 * 					 best case: O(n)
 * Space Complexity: O(1) auxiliary
 * @author ashi
 * 
 */
public class SelectionSort {
	public void selectionSort(int[] arrToSort) {
		int i, j, min, temp;
		for(i=0;i<arrToSort.length; i++) {
			min=i;
			for(j=i+1; j< arrToSort.length; i++) {
				if(arrToSort[j]<arrToSort[min]) {
					min=j;
				}
			}
			temp = arrToSort[min];
			arrToSort[min]=arrToSort[i];
			arrToSort[i]=temp;
		}
	}
}
