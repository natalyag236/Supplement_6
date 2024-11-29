/**
 * Represents a node in a binary tree with a unique node ID, data, 
 * and references to its left and right children.
 * 
 * Each node has a unique nodeID generated by a static counter that is 
 * incremented whenever a new node is created.
 */
public class Node {
    private static int idCounter = 0;  
    private int nodeID;
    private int data;
    private Node left;
    private Node right;
    /**
    * Constructs a new Node with the specified data.
    * 
    * The node ID is automatically assigned based on the static idCounter,
    * and the left and right children are initialized to null.
    * 
    * @param data The data to store in the node.
    */

    public Node(int data) {
        this.nodeID = idCounter++;  
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getNodeID() {
        return nodeID;
    }
    /**
    * Returns the data stored in the node.
    * 
    * @return The data stored in the node.
    */
    public int getData() {
        return data;
    }

    /**
     * Sets the data for the node.
     * 
     * @param data The data to set for the node.
     */
    public void setData(int data) {
        this.data = data;
    }
    /**
    * Returns the left child node.
    * 
    * @return The left child node, or null if no left child exists.
    */
    public Node getLeft() {
        return left;
    }
     /**
     * Sets the left child node.
     * 
     * @param left The node to set as the left child.
     */

    public void setLeft(Node left) {
        this.left = left;
    }
    /**
     * Returns the right child node.
     * 
     * @return The right child node, or null if no right child exists.
     */

    public Node getRight() {
        return right;
    }
    /**
     * Sets the right child node.
     * 
     * @param right The node to set as the right child.
     */

    public void setRight(Node right) {
        this.right = right;
    }
    /**
 * Inserts a value into the binary search tree.
 * 
 * If the value to be inserted is less than the current node's data, it is inserted
 * into the left subtree. If the value is greater than or equal to the current node's data,
 * it is inserted into the right subtree. The insertion is done recursively until an appropriate
 * null child is found, at which point a new node is created and added.
 * 
 * @param value the value to be inserted into the tree
 */
    public void insert(int value) {
        if (value < this.data) {
            if (this.left == null) {
                this.left = new Node(value);  
            } else {
                this.left.insert(value); 
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value); 
            } else {
                this.right.insert(value);  
            }
        }
}   }
