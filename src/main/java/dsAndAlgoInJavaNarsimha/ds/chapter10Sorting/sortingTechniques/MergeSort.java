/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter10Sorting.sortingTechniques;

/**
 * Problem:
 * Solution:
 * 
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n) auxiliary
 * @author ashi
 * 
 */
public class MergeSort {
	public int[] mergeSort(int[] a, int[]temp, int left, int right) {
		int mid;
		int[] tmp = new int[a.length];
		if(right > left) {
			mid=(left+right)/2;
			mergeSort(a, temp, left, mid);
			mergeSort(a, temp, mid+1,right);
			tmp = merge(a, temp, left, mid+1, right);                 
		}
		return tmp;
	}

	/**
	 * @param a
	 * @param temp
	 * @param left
	 * @param i
	 * @param right
	 */
	private int[] merge(int[] a, int[] temp, int left, int mid, int right) {
		int i, left_end, size, temp_pos;
		left_end=mid-1;
		temp_pos= left;
		size = right-left+1;
		while(left<=left_end && mid <=right) {
			if(a[left] <= a[mid]) {
				temp[temp_pos] = a[left];
				temp_pos=temp_pos+1;
				left=left+1;
			} else {
				temp[temp_pos]=a[mid];
				temp_pos = temp_pos+1;
				mid=mid+1;
			}
		}
		while(left <= left_end) {
				temp[temp_pos] = a[left];
				temp_pos=temp_pos+1;
				left=left+1;
		}
		while(mid <= right) {
			temp[temp_pos]=a[mid];
			temp_pos = temp_pos+1;
			mid=mid+1;
		}
		for(i=1; i<=size; i++) {
			a[right]=temp[right];
			right = right-1;
		}
		return temp;
	}
	
	public void displayArr(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args){
		//int[] a = {2,3,7,4,99,4,5,1,33,44,22,10};
		int [] a = {2,7,4,2,5,3};
		int[] tmp = new int[a.length];
		int left = 0;
		int right = a.length-1;
		MergeSort inst = new MergeSort();
		int [] sorted = inst.mergeSort(a, tmp, left, right);
		inst.displayArr(sorted);
	}
}
