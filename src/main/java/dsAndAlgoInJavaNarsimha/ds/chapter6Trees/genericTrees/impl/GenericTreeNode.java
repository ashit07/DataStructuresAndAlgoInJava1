/**
 * 
 */
package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.genericTrees.impl;

/**
 * Problem:
 * Solution:
 * 
 * Time Complexity: 
 * Space Complexity:
 * @author ashi
 * 
 */
public class GenericTreeNode {
	public int data;
	public GenericTreeNode firstChild;
	public GenericTreeNode nextSibling;
	
	public GenericTreeNode() {
		this.data = 0;
		this.firstChild = null;
		this.nextSibling = null;
	}
	/**
	 * @param data
	 * @param firstChild
	 * @param nextSibling
	 */
	public GenericTreeNode(int data) {
		this.data = data;
		this.firstChild = null;
		this.nextSibling = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public GenericTreeNode getFirstChild() {
		return firstChild;
	}
	public void setFirstChild(GenericTreeNode firstChild) {
		this.firstChild = firstChild;
	}
	public GenericTreeNode getNextSibling() {
		return nextSibling;
	}
	public void setNextSibling(GenericTreeNode nextSibling) {
		this.nextSibling = nextSibling;
	}	
}
