package dsAndAlgoInJavaNarsimha.ds.chapter7priorityQueue.heap.impl;

public class HeapUtility {

  public void buildHeap(Heap h, int[] array, int length) {
    if(h==null) {
      return;
    }
    while(length > h.capacity) {
      h.resizeHeap();
    }
    for(int i=0; i<length; i++) {
      h.array[i]=array[i];
    }
    System.out.println(h.toString());
    h.count=length;
    for (int i=length/2-1; i>=0; i--) {
      h.precolateDown(i);
    }
  }

  public void heapSort(int [] array, int length) {
    Heap h = new Heap(length, 0);
    int oldSize, i, temp;
    buildHeap(h, array, length);
    oldSize = h.count;
    for (i= length-1; i>0; i--) {
      temp = h.array[0];
      h.array[0] = h.array[i-1];
      h.array[i-1]=temp;
      h.precolateDown(0);
    }
    h.count=oldSize;
    System.out.println(h.toString());
  }

  public boolean isHeapRecursive(int [] array, int i, int length) {
    //If leaf Node
    if(i == (length-2)/2) {
      return true;
    }

    if(array[i]>array[2*i+1] && array[i]>array[2*i+2] && isHeapRecursive(array, 2*i+1, length) && isHeapRecursive(array, 2*i+2, length)) {
      return true;
    }
    return false;
  }
  public boolean isHeapIterative(int[] array, int length) {
    for (int i=0; i< (length-2)/2; i++) {
      if(array[2*i+1] > array[i]) {
        return false;
      }
      if(array[2*i+2] > array[i]) {
        return false;
      }
    }
    return true;
  }
  public static void main(String [] args) {
    HeapUtility hu = new HeapUtility();
    int[] arr = {20, 10, 30, 40, 50, 60, 13, 80, 100};
    hu.heapSort(arr, arr.length);

  }
}
