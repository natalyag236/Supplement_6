import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    public void test_node_IDUniqueness() {
        Node root = new Node(100);
        Node leftChild = new Node(200);
        Node rightChild = new Node(300);

        assertNotEquals(root.getNodeID(), leftChild.getNodeID());
        assertNotEquals(leftChild.getNodeID(), rightChild.getNodeID());
        assertNotEquals(root.getNodeID(), rightChild.getNodeID());
    }
}
