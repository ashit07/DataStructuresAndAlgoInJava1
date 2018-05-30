package dsAndAlgoInJavaNarsimha.ds.chapter4stack.Problems;

import java.util.EmptyStackException;

/**
 * Problem-15: How to implement 3 stacks in one array?
 * Solution: 
 * @author ashi
 * To implement 3 stacks, we keep the foll info:
 *  a) The index of first stack (Top1): This indicates the size of the first stack.
 *  b) The index of sec stack (Top2): This indicates the size of the sec stack.
 *  c) Starting index of third stack (base address of third stack).
 *  d) Top index of third stack.
 *  
 * Pushing:
 *  a) For pushing onto first stack, we need to see if adding a new elem causes
 *     it to bump into third stack. If so, try to shift the third stack upwards.
 *     Insert new elem at (Start1+Top1).
 *  b) For pushing to second stack, we need to see if adding a new elem causes it 
 *     to bump into third stack. If so, try to shift the third stack downwards.
 *     Insert new elem at (Start2-Top2)
 *  c) When pushing to third stack, see if it bumps the second stack. If so, 
 *     try to shift the third elem downward and try pushing again. Insert new elem 
 *     at start3+top3.
 *  Time Complexity: O(n) since we need to adjust the third stack.
 *  Space Complexity: O(1)
 *  
 *  Popping: 
 *  a) For popping, we don't need to shift, just decrement the size of 
 *     appropriate stack.
 *  Time Complexity: O(1)
 *  Space Complexity: O(1)
 *  
 *  
 */
class Problem015 {
private int[] dataArray;
private int size, topOne, topTwo, topThree, baseThree;
Problem015(int size) {
	this.dataArray = new int[size];
	this.size=size;
	this.topOne=-1;
	this.topTwo=size;
	this.baseThree=size/2;
	this.topThree=baseThree;
}
void push(int stackId, int data) {
	if(stackId==1) {
		if(topOne+1==topThree) {
			if(stack3IsRightShiftable()) {
				shiftStack3ToRight();
				dataArray[++topOne]=data;
			} else {
				throw new StackOverflowError("Stack One has reached max limit");
			}
		} else {
			dataArray[++topOne]= data;
		}
	} else if(stackId==2) {
		if(topTwo-1==topThree) {
			if(stack3IsLeftShiftable()) {
				shiftStack3ToLeft();
				dataArray[--topTwo]=data;
			} else {
				throw new StackOverflowError("Stack Two has reached max limit");
			}
		} else {
			dataArray[--topTwo]= data;
		}
	} else if(stackId==3) {
		if(topTwo-1==topThree) {
			if(stack3IsLeftShiftable()) {
				shiftStack3ToLeft();
				dataArray[++topThree]=data;
			} else {
				throw new StackOverflowError("Stack Two has reached max limit");
			}
		} else {
			dataArray[++topThree]= data;
		}
	} else {
		return;
	}
}
int top(int stackId) {
	if(stackId ==1) {
		if(isEmpty(stackId)) throw new EmptyStackException();
		return dataArray[topOne];
	} else if(stackId==2) {
		if(isEmpty(stackId)) throw new EmptyStackException();
		return dataArray[topTwo];
	} else if(stackId==3) {
		if(isEmpty(stackId)) throw new EmptyStackException();
		return dataArray[topOne];
	} else {
		return 0;
	}
	
}
int pop(int stackId) {
	if(stackId ==1) {
		if(isEmpty(stackId)) throw new EmptyStackException();
		int toPop = dataArray[topOne];
		dataArray[topOne--]=0;
		return toPop;
	} else if(stackId ==2) {
		if(isEmpty(stackId)) throw new EmptyStackException();
		int toPop = dataArray[topTwo];
		dataArray[topTwo++]=0;
		return toPop;
		
	} else if(stackId ==3) {
		if(isEmpty(stackId)) throw new EmptyStackException();
		int toPop = dataArray[topThree];
		if(topThree > baseThree) {
			dataArray[topThree--]=0;
		}
		if(topThree == baseThree) {
			dataArray[topThree]=0;
		}
		return toPop;
		
	} else {
		return 0;
	}
}
public boolean isEmpty(int stackId) {
	if(stackId==1) {
		return topOne == -1;
	} else if(stackId==2) {
		return topTwo == -1;
	} else if(stackId==3) {
		return topThree == this.size && dataArray[topThree]==0;
	} else {
		return true;
	}
}


private void shiftStack3ToLeft() {
	for(int i=baseThree-1;i<=topThree-1;i++) {
		dataArray[i]=dataArray[i-1];
	}
	dataArray[topThree--]=0;
	baseThree--;
	
}
private void shiftStack3ToRight() {
	for(int i=topThree+1;i>=baseThree+1;i--) {
		dataArray[i]=dataArray[i-1];
	}
	dataArray[baseThree++]=0;
	baseThree++;
}
private boolean stack3IsRightShiftable() {
	if(topThree+1 <topTwo) {
	return true;
	}
	return false;
	
}
private boolean stack3IsLeftShiftable() {
	if(topThree-1 >topOne) {
	return true;
	}
	return false;
	
}

}
 