package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;
/**
 * Problem-27: Recursively remove all adjacent duplicates. Given an arr of
 * numbers, recursively remove adjacent duplicate numbers. The output should not have
 * adjacent duplicates.
 * E.g. Input: 1,5,6,8,8,8,0,1,1,0,6,5 Output: 1
 * 		Input: 1,9,6,8,8,8,0,1,1,0,6,5 Output: 1,9,5
 * 
 * Solution: The solution runs with the concept of in-place stack.
 * When elem on stack doesnot match to current number, we add it to stack.
 * When it matches to stack top, we skip numbers until the element match to top of
 * stack and remove the elem from stack.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1) as stack emulation is done in place.
 * @author ashi
 *
 */
public class Problem027 {
public int removeAdjacentDuplicates(int[] A) {
	int stkPtr =1;
	int i=0;
	while(i<A.length) {
		if(stkPtr == -1 || A[stkPtr] != A[i]) {
			stkPtr++;
			A[stkPtr]=A[i];
			i++;		
		} else {
			while(i<A.length && A[stkPtr] == A[i]){
				i++;
			}
			stkPtr--;
		}
	}
	return stkPtr;
}
}
