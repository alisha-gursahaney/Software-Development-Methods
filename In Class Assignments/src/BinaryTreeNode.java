import BinaryTree.Node;

/**
 * Binary Tree Node
 * 
 * Tree node that has two children: left and right
 * 
 * @param <T> The type of data this tree node stores
 */

// Alisha Meena Gursahaney
// amg9zd

public class BinaryTreeNode<T> {

	
	
	
    /**
     * Reference pointer to the left subtree
     */
    private BinaryTreeNode<T> left;

    /**
     * Reference pointer to the right subtree
     */
    private BinaryTreeNode<T> right;

    /**
     * Data stored at this node
     */
    private T data;
    
//    public int countRight(int target) {
//		if (this.root == null) {
//			return 0;
//		}
//		return root.countRight(target);
//	}
    /**
     * Default Constructor [1]
     * 
     * Creates a binary tree node with null data and null children
     */
    public BinaryTreeNode(){
        this(null,null,null); // calls full Constructor [3] passing three null values; thus assigning all to null
    }

    /**
     * Data-only Constructor [2]
     * 
     * Creates a binary tree node with the given data and null children
     * 
     * @param theData The data to store at this node
     */
    public BinaryTreeNode(T theData){
        this(theData,null,null); // calls full Constructor [3] where left and right values are null
    }							 // thus: this.data = theData; this.left = null; this.right = null; 


    /**
     * Full Constructor [3]
     * 
     * Creates a binary tree node with the given data and child reference pointers
     * 
     * @param theData The data to store at this node
     * @param leftChild A reference pointer to the left subtree
     * @param rightChild A reference pointer to the right subtree
     */
    public BinaryTreeNode(T theData, BinaryTreeNode<T> leftChild, BinaryTreeNode<T> rightChild){
        this.data = theData;
        this.left = leftChild;
        this.right = rightChild;
    }


    /**
     * Left Child/Subtree getter
     * 
     * @return A reference pointer to the root of the left subtree
     */
    public BinaryTreeNode<T> getLeft() {
        return this.left;
    }

    /**
     * Left Child/Subtree Setter
     * 
     * @param left A reference pointer to the new left subtree's root node
     */
    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    /**
     * Right Child/Subtree getter
     * 
     * @return A reference pointer to the root of the right subtree
     */
    public BinaryTreeNode<T> getRight() {
        return this.right;
    }

    /**
     * Right Child/Subtree Setter
     * 
     * @param left A reference pointer to the new right subtree's root node
     */
    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    /**
     * Get the data at this node
     * 
     * @return The data stored at this node
     */
    public T getData() {
        return this.data;
    }

    /**
     * Set the data at this node
     * 
     * @param data The data to be stored at this node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * toString method
     *
     */
    @Override
    public String toString() {
        String retVal = "";
        if (this.left != null)
            retVal += this.left.toString(); // recursive call on left
        if (this.right != null) 
            retVal += this.right.toString(); // recursive call on right
        retVal += "("+this.data+")"; // add this node's data
        return retVal;
    }

    public int countRight(int target) {
    	// base case
    	if (this.data == null) {
    		return 0;
    	}
    	
    	int sum = 0;
    	if (this.left == null && this.right != null) {
    		if ((int) this.data > target) {
    			sum += 1;
    		}
    		// return countRight(target);
    	}
    	else if (this.left != null) {
    		return this.left.countRight(target);
    	}
    	else if (this.right != null) {
    		return this.right.countRight(target);
    	}
    	return sum;
    }
    /**
     * Main method
     * 
     * Your code should go here
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

		// Create a BinaryTreeNode that holds data of type Integer
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(15); 
        BinaryTreeNode<Integer> n29 = new BinaryTreeNode<Integer>(29);
        BinaryTreeNode<Integer> n10 = new BinaryTreeNode<Integer>(10);
        BinaryTreeNode<Integer> n18 = new BinaryTreeNode<Integer>(18);
        BinaryTreeNode<Integer> n25 = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode<Integer> n30 = new BinaryTreeNode<Integer>(30);
        BinaryTreeNode<Integer> n9 = new BinaryTreeNode<Integer>(9);
        BinaryTreeNode<Integer> n17 = new BinaryTreeNode<Integer>(17);
        
        
        root.setRight(n10);
        root.setLeft(n29);
        n29.setLeft(n18);
        n18.setRight(n9);
        n10.setLeft(n25);
        n25.setRight(n17);
        n10.setRight(n30);
        
        
        
		

		//TODO: Add  your code here 

        //Print the tree using toString() method (starting at the root of the tree) 
        System.out.println("Printing the tree:");
        System.out.println(root.toString());
        
        System.out.println(root.countRight(20));
    }

}