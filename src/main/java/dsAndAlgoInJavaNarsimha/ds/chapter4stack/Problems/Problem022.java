package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;
/**
 * Problem-22: Finding of spans: Given an arr A the span S[i] of A[i] is the max
 * number of consecutive elems A[j] immediately preceding A[i] and such that
 * A[j] <= A[j+1]?
 * 
 * Solution: This is a very common problem in stock markets to find the peaks.
 * Spans are used in financial analysis. The span of a stock price on a certain day,
 * i, is the max number of consecutive days (up to current day) the price of
 * stock has been less than or equal to its price on i. 
 * One simple way to find this, each day, check how many contiguous days are with 
 * less stock price than current price.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * @author ashi
 *
 */
class Problem022 {
	int [] findingSpans (int[] inputArr) {
		int[] spans = new int[inputArr.length];
		for(int i=0; i<inputArr.length;i++) {
			int span=1;
			int j=i-1;
			while(j>0 && inputArr[j]<= inputArr[j+1]) {
				span++;
				j--;
			}
			spans[i]=span;
		}
		return spans;
	}
	public static void main(String[] args) {
		int [] inputArr = {6,3,4,5,2};
		int [] spansArr = new Problem022().findingSpans(inputArr);
		System.out.print("["+spansArr[0]);
		for(int i=1; i< spansArr.length;i++) {
			System.out.print(","+spansArr[i]);
		}
		System.out.print("]");
	}
}
