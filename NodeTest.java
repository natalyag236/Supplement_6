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

    @Test
    public void testInsertData() {
        Node root = new Node(10);

        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);
        root.insert(12);
        root.insert(20);

        assertNotNull(root.getLeft());
        assertNotNull(root.getRight());
        assertEquals(5, root.getLeft().getData());
        assertEquals(15, root.getRight().getData());

        assertEquals(3, root.getLeft().getLeft().getData());
        assertEquals(7, root.getLeft().getRight().getData());
        assertEquals(12, root.getRight().getLeft().getData());
        assertEquals(20, root.getRight().getRight().getData());
    }

    @Test
    public void testDumpNodeToString() {
        Node root = new Node(10);
        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);
        root.insert(12);
        root.insert(20);

        String expectedDump = "NodeID: 0, Data: 10\n"
                            + "\tNodeID: 1, Data: 5\n"
                            + "\t\tNodeID: 2, Data: 3\n"
                            + "\t\tNodeID: 3, Data: 7\n"
                            + "\tNodeID: 4, Data: 15\n"
                            + "\t\tNodeID: 5, Data: 12\n"
                            + "\t\tNodeID: 6, Data: 20\n";

        assertEquals(expectedDump, root.dumpNodeString(0));
    }
}
