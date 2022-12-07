
import java.util.*;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public int size() {
	if ( root == null ) {
		return 0;
		} else {
		 return root.size();
		}
	}
		

class Node {
	
	Tree tree;
	Node left;
	Node right;
	
	public Node() {
		tree = new Tree();
		left = null;
		right = null;
	}
	public Node(Tree tree1) {
		tree= tree1;
		left=null;
		right=null;
		
	}

	 public int size() {
	 int size = 0;
	 if (left != null) {
	 size = size+left.size();
	 }
	 if (right != null) {
	 size = size+right.size();
	 }
	 size ++; // for the current node!
	 return size;
	}
	 
	}	 
}
