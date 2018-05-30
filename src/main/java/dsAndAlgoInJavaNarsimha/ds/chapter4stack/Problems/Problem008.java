package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;
/**
 * Problem-8: Given an arr of chars formed with a's and b's. The string is marked
 * with special char X which represents the middle of the list. Check whether the 
 * list is palindrome. (eg. ababa...ababXbabab...baaa).
 * 
 * Solution: This is one of simplest algo. Start two indexes one at the beg of 
 * the string and other at the end of string. Each time compare whether the values
 * at both indexes are same or not. 
 * 
 * @author ashi
 *
 */
class Problem008 {

	public int isPalindrome(String inputStr) {
		int i=0, j=inputStr.length();
		char[] A = inputStr.toCharArray();
		while(i<j && A[i]==A[j]) {
			i++;
			j--;
		}
		if(i<j) {
			System.out.println("Not a palindrome");
			return 0;
		}
		System.out.println("Palindrome");
		return 1;
	}
}
