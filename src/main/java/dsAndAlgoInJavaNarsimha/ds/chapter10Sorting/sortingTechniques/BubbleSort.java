/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter10Sorting.sortingTechniques;

/**
 * Problem:
 * Solution:
 * 
 * Time Complexity:  worst case: O(n^2)
 * 					 best case (improved version) : O(n)
 * 					 avg case  : O(n^2)
 * Space Complexity: O(1)
 * @author ashi
 * 
 */
public class BubbleSort {
	public int[] bubbleSort(int[] arrToSort) {
		for(int pass=arrToSort.length; pass>=0; pass++) {
			for(int i=0;i<=pass-1;i++) {
				if(arrToSort[i]>arrToSort[i+1]) {
					int tmp = arrToSort[i];
					arrToSort[i] = arrToSort[i+1];
					arrToSort[i+1]=tmp;
				}
			}
		}
		return arrToSort;
	}
	/**
	 * We can improve the above by using a flag. No more swaps indicate the completion of sorting.
	 * If list is already sorted, we can use this flag to skip the remaining passes. 
	 * @param arrToSort
	 * @return
	 */
	public int[] bubbleSortImprovedVersion(int[] arrToSort) {
		boolean swapped=true;
		for(int pass=arrToSort.length; pass>=0&&swapped; pass++) {
			swapped=false;
			for(int i=0;i<=pass;i++) {
				if(arrToSort[i]>arrToSort[i+1]) {
					int tmp = arrToSort[i];
					arrToSort[i] = arrToSort[i+1];
					arrToSort[i+1]=tmp;
					swapped=true;
				}
			}
		}
		return arrToSort;
	}
}
