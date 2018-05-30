package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.EmptyStackException;

/**
 * Problem-14: How do we implement 2 stacks using only one array?
 * Solution: 
 * Algo:
 * 1) Start two indexes one at left end and other at right end.
 * 2) The left index simulates the first stack and the right index simulates the
 *    second stack.
 * 3) If we want to push an element onto first stack, put the elem at left index.
 * 4) If we want to push an element onto sec stack, put the elem at right index.
 * 5) First stack gets grows towards right and second stack grows towards left.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * 
 * @author ashi
 *
 */
//ArrayWithTwoStacks
class Problem014 {
	public int[] dataArray;
	int size;
	int topOne;
	int topTwo;
	public Problem014(int size) {
		if(size <2) throw new IllegalStateException("size < 2 is not permissable");
		this.dataArray = new int[size];
		this.size=size;
		this.topOne=-1;
		this.topTwo=size;
	}
	
	void push(int stackId, int data) {
		if(topTwo==topOne+1) throw new StackOverflowError("Array is full");
		if(stackId==1) {
			dataArray[++topOne]=data;
		} else if(stackId==2) {
			dataArray[--topTwo]=data;
		} else {
			return;
		}
	}
	int pop(int stackId) {
		if(stackId==1) {
			if(topOne==-1) throw new EmptyStackException();
			int toPop = dataArray[topOne];
			dataArray[topOne--] = 0;
			return toPop;		
		} else if(stackId==2) {
			if(topTwo==this.size) throw new EmptyStackException();
			int toPop = dataArray[topTwo];
			dataArray[topTwo++] = 0;
			return toPop;
		} else {
			return Integer.MIN_VALUE;
		}
	}
	public int top(int stackId) {
		if(stackId==1) {
			if(topOne == -1) throw new EmptyStackException();
			return dataArray[topOne];
		} else if (stackId==2){
			if(topTwo == this.size) throw new EmptyStackException();
			return dataArray[topTwo];
		} else {
			return Integer.MIN_VALUE;
		}
	}
	public boolean isEmpty(int stackId) {
		if(stackId==1) {
			return topOne == -1;
		} else if (stackId==2){
			return topTwo == this.size;
		} else {
			return true;
		}
	}
}
