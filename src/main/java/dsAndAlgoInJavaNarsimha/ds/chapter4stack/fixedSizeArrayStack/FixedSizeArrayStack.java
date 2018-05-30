package dsAndAlgoInJavaNarsimha.ds.chapter4stack.fixedSizeArrayStack;
/**
 * Fixed size array stack supports following operations:
 * 
 * @author ashi
 *
 */
public class FixedSizeArrayStack {
	//Length of array used to implement the stack
	protected int capacity;
	//Default capacity
	public static final int CAPACITY=10;
	//Array used to implement stack
	protected int[] stackRep;
	//Index of top element of stack in array
	protected int top =-1;
	
	//Initializes the stack to use an array of given length
	public FixedSizeArrayStack() {
		this(CAPACITY);
	}
	// Initializes the stack to use an array of given length
	public FixedSizeArrayStack(int capacity) {
		this.capacity=capacity;
		stackRep = new int[capacity];
	}
	//Returns the number of elements in stack. Runs in O(1) time.
	public int size() {
		return top+1;
	}
	//Tests whether the stack is empty. Runs in O(1) time.
	public boolean isEmpty() {
		return top<0;
	}
	
	//Inserts an ele at top of stack. Runs in O(1) time. 
	public void push(int data) throws Exception {
		if(size() == capacity) {
			throw new Exception("Stack is full");
		}
		stackRep[top++]=data;
	}
	
	//Inspects the element at top of stack. Runs in O(1) time.
	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return stackRep[top];
	}
	//Removes the element at top. 
	public int pop() throws Exception{
		int data;
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		return data;
	}
	
	//Returns a string representation of stack as a list of elements, with 
	//the top element at the end. This method runs in O(n) time, where n is 
	//the size of stack.
	public String toString() {
		String s;
		s="[";
		if(size() >0) {
			s += stackRep[0];
		}
		if(size() >1) {
			for(int i=1;i<size(); i++) {
				s += ", "+stackRep[i];
			}
		}
		return s+"]";
	}
}
