package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.dynamicSizeArrayQueue;

public class DynamicSizeArrayQueue {
	private int[] queueRep;
	private int size, rear, front;
	private static int CAPACITY;
	private static int MIN_CAPACITY;
	public DynamicSizeArrayQueue() {
		CAPACITY=16;
		MIN_CAPACITY=1<<15;
		queueRep = new int[CAPACITY];
		size=0;
		front=0;
		rear=0;
	}
	public DynamicSizeArrayQueue(int cap) {
		CAPACITY=cap;
		MIN_CAPACITY=1<<15;
		queueRep = new int[CAPACITY];
		size=0;
		front=0;
		rear=0;
	}	
	//Inserts elem at rear of the queue. This method runs in O(1) time.
	public void enQueue(int data) throws Exception{
		if(size == CAPACITY) {
			expand();
		} else {
			size++;
			queueRep[rear]=data;
			rear=(rear+1)%CAPACITY;
		}
	}
	private void expand() {
		int length=size();
		int [] newQueue = new int[2*length];
		for(int i=front; i<= rear; i++) {
			newQueue[i-front]=queueRep[i%CAPACITY];
		}
		queueRep=newQueue;
		front=0;
		rear=size-1;
		CAPACITY *=2;
	}
	private void shrink() {
		int length=size();
		if(length <= MIN_CAPACITY || length<<2>=length)
			return;
		if(length<MIN_CAPACITY) length = MIN_CAPACITY;
		int[] newQueue = new int[length];
		System.arraycopy(queueRep, 0, newQueue, 0, length+1);
		queueRep=newQueue;
	}
	public int deQueue() throws Exception{
		if(size==0) {
			throw new IllegalStateException("Queue us empty");
		}
		int data = queueRep[front];
		queueRep[front]=Integer.MIN_VALUE;
		front=(front+1)%CAPACITY;
		size--;
		return data;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==CAPACITY;
	}
	public int size() {
		return size;
	}
	public String toString() {
	String result="[";
	for(int i=0; i<size; i++) {
		result+=Integer.toString(queueRep[(front+i)%CAPACITY]);
		if(i < size-1) {
			result+=",";
		}
	}
	result+="]";
	return result;
	}
}
