package datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    BinarySearchTree bst;
    @BeforeEach
    void setUp() {
        bst = new BinarySearchTree();
    }

    @Test
    void insert() {
        bst.insert(1);
        int root = bst.root.value;
        assertEquals(1,root);
    }


    @Test
    void insertMany() {
        bst.insert(50);
        bst.insert(51);
        bst.insert(27);
        bst.insert(29);
        bst.insert(25);
        assertEquals(25,bst.root.left.left.getValue());
    }

    @Test
    void insertManyRootTest() {

        Node node = bst.root;
        bst.insert(50);
        bst.insert(51);
        bst.insert(27);
        bst.insert(29);
        bst.insert(25);
        assertEquals(25,bst.root.left.left.getValue());
        assertEquals(Arrays.asList(25,27,29,50,51),bst.DFSInOrder());
        assertEquals(Arrays.asList(50, 27, 25, 29, 51),bst.DFSPreOrder());
        assertEquals(Arrays.asList(25, 29, 27, 51, 50),bst.DFSPostOrder());
        assertEquals(Arrays.asList(50, 27, 51, 25, 29),bst.BFS());
    }

    @Test
    void contains() {
        //Arrange
        bst.insert(25);
        //Act
        boolean found   = bst.contains(25);
        boolean found2   = bst.contains(10);
        //Assert
        assertTrue(found);
        assertFalse(found2);
    }


    @Test
    void kthSmallest() {
        Node node = bst.root;
        bst.insert(50);
        bst.insert(51);
        bst.insert(27);
        bst.insert(29);
        bst.insert(25);
//        assertEquals(50,bst.kthSmallest(4));
        assertEquals(51,bst.kthSmallest(5));
        assertNull(bst.kthSmallest(10));
    }
}
