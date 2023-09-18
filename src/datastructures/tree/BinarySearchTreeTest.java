package datastructures.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}
