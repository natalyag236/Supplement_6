public class Node {
    private static int idCounter = 0;  
    private int nodeID;
    private int data;
    private Node left;
    private Node right;


    public Node(int data) {
        this.nodeID = idCounter++;  
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getNodeID() {
        return nodeID;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
