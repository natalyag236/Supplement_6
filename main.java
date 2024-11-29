import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.Test;                

public class main{

    @Test
    public void test_node_IDUniqueness() {
        Node root = new Node(100);
        Node leftChild = new Node(200);
        Node rightChild = new Node(300);

        assertNotEquals(root.getNodeID(), leftChild.getNodeID());
        assertNotEquals(leftChild.getNodeID(), rightChild.getNodeID());
        assertNotEquals(root.getNodeID(), rightChild.getNodeID());
    }

    @Test
    public void test_node_Data() {
        Node root = new Node(100);
        Node leftChild = new Node(200);
        Node rightChild = new Node(300);

        assertEquals(100, root.getData());
        assertEquals(200, leftChild.getData());
        assertEquals(300, rightChild.getData());
    }

    @Test
    public void testChildReferences() {
        Node root = new Node(100);
        Node leftChild = new Node(200);
        Node rightChild = new Node(300);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        assertSame(leftChild, root.getLeft());
        assertSame(rightChild, root.getRight());
    }

    @Test
    public void testDataUpdate() {
        Node root = new Node(100);
        root.setData(150);

        assertEquals(150, root.getData());
    }
}
