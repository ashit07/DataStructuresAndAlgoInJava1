package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.problems;

import dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.impl.BinarySearchTreeNode;

public class Problem059 {

  public Problem059() {

  }

  public BinarySearchTreeNode BST2DLL(BinarySearchTreeNode root, BinarySearchTreeNode LTail) {
    BinarySearchTreeNode ltail, left, right, rtail;
    if(root==null) {
      ltail=null;
      return null;
    }
    left = BST2DLL(root.getLeft(), ltail);

  }


}
