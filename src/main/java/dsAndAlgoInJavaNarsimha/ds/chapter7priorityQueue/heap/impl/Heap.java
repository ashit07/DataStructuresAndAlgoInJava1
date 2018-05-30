package dsAndAlgoInJavaNarsimha.ds.chapter7priorityQueue.heap.impl;

public class Heap {
  public int[] array;
  public int count;
  public int capacity;
  public int heapType;
  public Heap(int capacity, int heapType) {
    this.capacity=capacity;
    this.heapType=heapType;
    this.count=0;
    this.array = new int[capacity];
  }
  public int parent(int i) {
    if(i<=0 || i>this.count){
      return -1;
    }
    return (i-1)/2;
  }
  public int leftChild(int i) {
    int left = i*2+1;
    if(left >= this.count) {
      return -1;
    }
    return left;
  }
  public int rightChild(int i) {
    int right = i*2+2;
    if(right >= this.count) {
      return -1;
    }
    return right;
  }
  public int getMax() {
    if(this.count==0) {
      return -1;
    }
    return this.array[0];
  }
  public void precolateDown(int i) {
    int l, r, max=i, temp;
    l=leftChild(i);
    r=rightChild(i);
    if(l!=-1 && this.array[l] > this.array[i]){
      max=l;
    }
    if(r!=-1 && this.array[r] > this.array[max]) {
      max=r;
    }

    if(max!=i) {
      temp = this.array[i];
      this.array[i]=this.array[max];
      this.array[max]=temp;
      precolateDown(max);
    }
  }
  public int deleteMax() {
    if(this.count==0) {
      return -1;
    }
    int data = this.array[0];
    this.array[0]= this.array[this.count-1];
    this.count--;
    precolateDown(0);
    return data;
  }

  public void insert(int data) {
    int i;
    if(this.count==this.capacity) {
      resizeHeap();
    }
    this.count++;
    i=this.count-1;
    while(i>=0 && data > this.array[(i-1)/2]) {
      this.array[i]=this.array[(i-1)/2];
      i=(i-1)/2;
    }
    this.array[i]=data;
  }
  public void resizeHeap() {
    int [] arrOld = new int [this.capacity];
    System.arraycopy(this.array, 0, arrOld, 0, this.count-1);
    this.array= new int[this.capacity*2];
    for(int i=0; i<this.capacity; i++) {
      this.array[i]=arrOld[i];
    }
    this.capacity *=2;
    arrOld=null;
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(int i=0; i< this.array.length;i++) {
      sb.append(this.array[i]).append(" ");
    }
    return sb.toString();
  }
}
