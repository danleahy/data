package datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList myLinkedList;

    @BeforeEach
    void setUp() {
        int[] myArray = {1, 2, 3, 4, 5};
        myLinkedList = new LinkedList(myArray);
    }

    @Test
    void partitionList() {
        //Arrange
        int[] myArray = {1, 4, 20, 3, 5};
        myLinkedList = new LinkedList(myArray);

        //Act
        myLinkedList.printList();
        myLinkedList.partitionList(5);
        myLinkedList.printList();
        //Assert
        assertNotNull(myLinkedList);
        assertEquals(5, myLinkedList.length);
    }

    @Test
    void removeDuplicates() {
        //Arrange
        int[] myArray = {1,1,2,4,5};
        myLinkedList = new LinkedList(myArray);

        //Act
        myLinkedList.printList();
        myLinkedList.removeDuplicates();
        myLinkedList.printList();
        //Assert
        assertEquals(4,myLinkedList.length);




    }
}
