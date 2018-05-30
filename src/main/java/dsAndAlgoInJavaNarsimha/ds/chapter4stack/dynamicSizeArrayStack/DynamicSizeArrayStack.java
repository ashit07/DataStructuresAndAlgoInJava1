package dsAndAlgoInJavaNarsimha.ds.chapter4stack.dynamicSizeArrayStack;

public class DynamicSizeArrayStack {

	protected int capacity;
	
	public static final int CAPACITY = 16;
	public static final int MIN_CAPACITY = 1<<15;
	int [] stackRep;
	
	protected int top = -1;
	public DynamicSizeArrayStack() {
		this(CAPACITY);
	}
	public DynamicSizeArrayStack(int cap) {
		this.capacity = cap;
		stackRep = new int[capacity];
	}
	
	public int size(){
		return top+1;
	}
	public boolean isEmpty() {
		return top <0;
	}
	public void push(int data) throws Exception {
		if(size() == capacity) {
			expand();
		}
		stackRep[++top] = data;
	}
	private void expand() {
		int[] stackRepExpanded = new int[size()*2];
		System.arraycopy(stackRep, 0, stackRepExpanded, 0, size());
		stackRep = stackRepExpanded;
	}
	//dynamic array operation, shrinks to half if more than 3/4 empty.
 	public void shrink() {
		int length = top + 1;
		if(length <= MIN_CAPACITY || top<<2 > length){
			return;
		}
		length = length + (top << 1);
		if(top< MIN_CAPACITY) {
			length = MIN_CAPACITY;
		}
		int [] newStack = new int[length];
		System.arraycopy(stackRep, 0, newStack, 0, top+1);
		stackRep = newStack;
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
