package dsAndAlgoInJavaNarsimha.ds.chapter5Queue.fixedSizeArrayQueue;

public class FixedSizeArrayQueue {
private int [] queueRep;
private int size, front, rear;

private static int CAPACITY;
public FixedSizeArrayQueue() {
	CAPACITY=16;
	queueRep = new int[CAPACITY];
	size=0;
	front=0;
	rear=0;
}
public FixedSizeArrayQueue(int cap) {
	CAPACITY=cap;
	queueRep = new int[CAPACITY];
	size=0;
	front=0;
	rear=0;
}	
//Inserts elem at rear of the queue. This method runs in O(1) time.
public void enQueue(int data) throws Exception{
	if(size == CAPACITY) {
		throw new IllegalStateException("Queue is full");
	} else {
		size++;
		queueRep[rear]=data;
		rear=(rear+1)%CAPACITY;
	}
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
