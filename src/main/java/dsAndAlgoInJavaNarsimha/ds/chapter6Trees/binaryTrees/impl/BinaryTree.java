package dsAndAlgoInJavaNarsimha.ds.chapter6Trees.binaryTrees.impl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * Provide functionalities like:
 * a) Finding max element in binary tree using recursion.
 * b) Finding max element in binary tree using level order
 * 	  traversal without recursion.
 * c) Searching for an element using recursion.
 * d) Searching for an element using level order traversal without recursion.
 *
 * @author ashi
 *
 */
public class BinaryTree {
	/**
	 * Problem002
	 * @param root
	 * @return
	 */
	public static int maxInBineryTreeLevelOrder(BinaryTreeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int max = Integer.MIN_VALUE;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()) {
			BinaryTreeNode tmp = q.poll();
			if(tmp.getData() > max) {
				max = tmp.getData();
			}
			if(tmp != null) {
				if(tmp.getLeft() != null) {
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight() != null) {
					q.offer(tmp.getLeft());
				}
			}
		}
		return max;
	}
	/**
	 * Problem001
	 * @param root
	 * @return
	 */
	 public static int maxValueInBinaryTree(BinaryTreeNode root) {
		 int maxValue = Integer.MIN_VALUE;
		 if(root != null) {
			 int leftMax = maxValueInBinaryTree(root.getLeft());
			 int rightMax = maxValueInBinaryTree(root.getRight());
			 if(leftMax > rightMax) {
				 maxValue = leftMax;
			 } else {
				 maxValue = rightMax;
			 }
			 if(root.getData() > maxValue) {
				 maxValue = root.getData();
			 }
		 }
		 return maxValue;
	 }
	 /**
	  * Problem003
	  * @param root
	  * @param data
	  * @return
	  */
	 public static boolean findInBinaryTree(BinaryTreeNode root, int data) {
			if(root==null) {
				return false;
			}
			if(root.getData()==data) {
				return true;
			}
			return findInBinaryTree(root.getLeft(), data) || findInBinaryTree(root.getRight(), data);
	  }

	 public static BinaryTreeNode findInBinaryTreeLevelOrder(BinaryTreeNode root, int data){
			if(root== null) {
				return null;
			}
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
			q.offer(root);
			while(!q.isEmpty()) {
				BinaryTreeNode tmp = q.poll();
				if(tmp.getData() == data){
					return tmp;
				}
				if(tmp != null) {
					if(tmp.getLeft()!=null) {
						q.offer(tmp.getLeft());
					}
					if(tmp.getRight() != null) {
						q.offer(tmp.getRight());
					}
				}
			}
			return null;
		}
	 /**
	  * Problem005
	  * @param root
	  * @param data
	  * @return
	  */
	 public static BinaryTreeNode insertInBinaryTreeIterative(BinaryTreeNode root, int data){
			if(root==null) {
				return null;
			}
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
			q.offer(root);
			while(!q.isEmpty()) {
				BinaryTreeNode tmp = q.poll();
				if(tmp!=null) {
					if(tmp.getLeft()!=null) {
						q.offer(tmp.getLeft());
					} else {
						tmp.setLeft(new BinaryTreeNode(data));
						return root;
					}
					if(tmp.getRight()!=null) {
						q.offer(tmp.getRight());
					} else {
						tmp.setRight(new BinaryTreeNode(data));
						return root;
					}
				}
			}
			return root;
		}
	 /**
	  * Problem005
	  * @param root
	  * @param data
	  * @return
	  */
		public static BinaryTreeNode insertInBinaryTreeRecurive(BinaryTreeNode root, int data) {
			if(root == null) {
				return null;
			}
			insertHelper(root, data);
			return root;
		}
		private static void insertHelper(BinaryTreeNode root, int data) {
			if(root.getData()>= data) {
				if(root.getLeft()==null) {
					root.setLeft(new BinaryTreeNode(data));
				} else {
					insertHelper(root.getRight(), data);
				}
			} else {
				if(root.getRight()==null) {
					root.setRight(new BinaryTreeNode(data));
				} else {
					insertHelper(root.getLeft(), data);
				}
			}
		}
		/**
		 * Problem-7
		 * @param root
		 * @return
		 */
		public static int size(BinaryTreeNode root){
			int count=0;
			if(root== null) {
				return 0;
			}
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
			q.offer(root);
			while(!q.isEmpty()){
				BinaryTreeNode tmp = q.poll();
				count++;
				if(tmp.getLeft()!=null) {
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight()!=null) {
					q.offer(tmp.getRight());
				}
			}
			return count;
		}
		public static void deleteBinaryTree(BinaryTreeNode root) {
			if(root==null) {
				return;
			}
			Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
			s.push(root);
			BinaryTreeNode prev=null;
			while(!s.isEmpty()){
				BinaryTreeNode curr = s.peek();
				if(prev == null || prev.getLeft()==curr || prev.getRight()==curr) {
					if(curr.getLeft()!=null) {
						s.push(curr.getLeft());
					} else if(curr.getRight()!=null) {
						s.push(curr.getRight());
					}
				} else if(curr.getLeft()==prev) {
					if(curr.getRight()!=null) {
						s.push(curr.getRight());
					}
				} else {
					deleteNode(curr);
					s.pop();
				}
				prev=curr;
			}
		}
		private static void deleteNode(BinaryTreeNode root) {
			root=null;
		}
		/**
		 * Problem14
		 * @param root
		 * @return
		 */
		public static BinaryTreeNode deepestNodeInBinaryTree(BinaryTreeNode root){
			if(root == null) {
				return null;
			}
			BinaryTreeNode curr = null;
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode> ();
			q.offer(root);
			while(!q.isEmpty()) {
				curr = q.poll();
				if(curr!=null) {
					if(curr.getLeft()!=null) {
						q.offer(curr.getLeft());
					}
					if(curr.getRight()!=null) {
						q.offer(curr.getRight());
					}
				}
			}
			return curr;
		}
		/**
		 * Problem15
		 * @param root
		 * @param data
		 * @return
		 */
		public static int deleteFromBinaryTree(BinaryTreeNode root, int data) {
			BinaryTree bt = new BinaryTree();
			BinaryTreeNode nodeToBeDeleted = bt.findInBinaryTreeLevelOrder(root, data);
			BinaryTreeNode deepestNode = bt.deepestNodeInBinaryTree(root);
			BinaryTreeNode tmp = nodeToBeDeleted;
			nodeToBeDeleted = deepestNode;
			deepestNode = null;
			return tmp.getData();
		}
		/**
		 * Problem-16
		 * @param root
		 * @return
		 */
		public static int numberOfLeavesInBTusingLevelOrder(BinaryTreeNode root) {
			 if(root==null) {
				 return 0;
			 }
			 int count=0;
			 Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode> ();
			 q.offer(root);
			 while(!q.isEmpty()) {
				 BinaryTreeNode tmp = q.poll();
				 if(tmp!=null) {
					 if(tmp.getLeft()==null && tmp.getRight()==null) {
						 count++;
					 }
					 if(tmp.getLeft()!=null) {
						 q.offer(tmp.getLeft());
					 }
					 if(tmp.getRight()!=null) {
						 q.offer(tmp.getRight());
					 }
				 }
			 }
			 return count;
		 }
		/**
		 * Problem-17
		 * @param root
		 * @return
		 */
		 public static int numberOfFullNodesInBTUsingLevelOrder(BinaryTreeNode root) {
			 if(root == null) {
				 return 0;
			 }
			 Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
			 q.offer(root);
			 int count=0;
			 while(!q.isEmpty()){
				 BinaryTreeNode tmp = q.poll();
				 if(tmp.getLeft()!=null && tmp.getRight()!=null) {
					 count++;
				 }
				 if(tmp.getLeft()!=null) {
					 q.offer(tmp.getLeft());
				 }
				 if(tmp.getRight()!=null) {
					 q.offer(tmp.getRight());
				 }
			 }
			 return count;
		 }
		 /**
		  * Problem-18
		  * @param root
		  * @return
		  */
		 public static int numberOfHalfnodesInBTUsingLevelOrder(BinaryTreeNode root){
				if(root == null) {
					return 0;
				}
				Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
				q.offer(root);
				int count =0;
				while(!q.isEmpty()){
					BinaryTreeNode tmp = q.poll();
					if((tmp.getLeft() != null && tmp.getRight() == null) ||
							(tmp.getLeft() == null && tmp.getRight() != null)) {
						count++;
					}
					if(tmp.getLeft()!=null) {
						q.offer(tmp.getLeft());
					}
					if(tmp.getRight()!=null) {
						q.offer(tmp.getRight());
					}
				}
				return count;
			}
}
