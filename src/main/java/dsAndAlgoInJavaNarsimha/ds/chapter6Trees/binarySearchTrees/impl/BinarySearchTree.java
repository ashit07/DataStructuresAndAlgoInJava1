/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binarySearchTrees.impl;

/**
 * Problem:
 * Solution:
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class BinarySearchTree {
	/**
	 * Time Complexity: O(n), in worst case (when BST is a skew tree)
	 * Space Complexity: O(n)
	 * @param root
	 * @param data
	 * @return
	 */
	public BinarySearchTreeNode findRecursive(BinarySearchTreeNode root, int data) {
		if(root==null) return null;
		if(data<root.getData()) {
			return findRecursive(root.getLeft(), data);
		} else if(data>root.getData()) {
			return findRecursive(root.getRight(), data);
		}
		return root;
	}
	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * @param root
	 * @param data
	 * @return
	 */
	public BinarySearchTreeNode findIterative(BinarySearchTreeNode root, int data) {
		if(root==null) return null;
		while(root!=null) {
			if(data==root.getData()){
				return root;
			}
			if(data < root.getData()) {
				root = root.getLeft();
			} else if (data > root.getData()){
				root = root.getRight();
			}
		}
		return null;
	}
	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode findMinRecursive(BinarySearchTreeNode root){
		if(root==null) return null;
		else {
			if(root.getLeft()==null) {
				return root;
			} else {
				return findMinRecursive(root.getLeft());
			}
		}
		
	}
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 	
 * @param root
 * @return
 */
	public BinarySearchTreeNode findMinIterative(BinarySearchTreeNode root) {
		if(root==null) return null;
		while(root.getLeft()!=null) {
			root = root.getLeft();
		}
		return root;
	}
	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode findMaxRecursive(BinarySearchTreeNode root) {
		if(root==null) return null;
		else {
			if(root.getRight()==null) {
				return root;
			} else {
				return findMaxRecursive(root.getRight());
			}
		}
	}
	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode findMaxIterative(BinarySearchTreeNode root) {
		if(root==null) return null;
		while(root.getRight()!=null) {
			root = root.getRight();
		}
		return root;
	}
	
	public BinarySearchTreeNode insert(BinarySearchTreeNode root, int data) {
		if(root == null) {
			root = new BinarySearchTreeNode();
			if(root == null) {
				System.out.println("Memory Error");
				return null;
			} else {
				root.setData(data);
				root.setLeft(null);
				root.setRight(null);
			}
		} else {
			if(data < root.getData()) {
				root.setLeft(insert(root.getLeft(), data));
			} else if(data > root.getData()) {
				root.setRight(insert(root.getRight(), data));
			}
		}
		return root;
	}
	
	public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data) {
		BinarySearchTreeNode temp;
		if(root==null) System.out.println("Element not there in tree");
		else if (data < root.getData()) {
			root.setLeft(delete(root.getLeft(), data));
		} else if(data > root.getData()){
			root.setRight(delete(root.getRight(), data));
		} else {	//Found the element
			if(root.getLeft()!= null &&root.getRight()!= null) {
				temp = findMaxIterative(root.getLeft());
				root.setData(temp.getData());
				root.setLeft(delete(root.getLeft(), root.getData()));
			} else {
				temp = root;
				if(root.getLeft()==null) {
					root=root.getRight();
				}
				if(root.getRight()==null) {
					root = root.getLeft();
				}
				temp = null;
			}
		}
		return root;
	}
}
