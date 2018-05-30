/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter10Sorting.sortingTechniques;

/**
 * Problem:
 * Solution:
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class QuickSort {
	public void quickSort(int[]a, int low, int high) {
		int pivot= partition(a, low, high);
		if(high>low) {
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
	}

	/**
	 * @param a
	 * @param low
	 * @param high
	 * @return
	 */
	private int partition(int[] a, int low, int high) {
		int mid = (low+high)/2;
		int left, right, pivot_item = a[mid];
		left = low;
		right = high;

		while(left <right) {
			while(left < a.length && a[left] <= pivot_item) {
				left++;
			}
			while(right >0 && a[right]>pivot_item) {
				right--;
			}
			if(left<right) {
				swap(a, left, right);
				left++;
				right--;
			}
		}
		
		a[mid]=a[right];
		a[right] = pivot_item;
		
		return right;
	}
	public void displayArr(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	/**
	 * @param a
	 * @param left
	 * @param right
	 */
	private void swap(int[] a, int left, int right) {
		int temp = a[left];
		a[left]=a[right];
		a[right] = temp;
	}
	public static void main(String [] args) {
//		int [] a = {2,7,4,2,5,3};
		int [] a = {1,12,5,26,7,14,3,7,2};
		QuickSort inst = new QuickSort();
		inst.quickSort(a, 0, a.length-1);
		inst.displayArr(a);
	}
}
