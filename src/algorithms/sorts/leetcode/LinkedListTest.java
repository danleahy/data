package algorithms.sorts.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList linkedList;

    @BeforeEach
    void setUp() {
    }

    @Test
    void bubbleSort() {
        //Arrange
        linkedList = new LinkedList(4);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.append(1);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        //Act
        linkedList.bubbleSort();
        //Assert

        linkedList.printList();
    }

    @Test
    void selectionSort() {
        //Arrange
        linkedList = new LinkedList(4);
        linkedList.append(8);
        linkedList.append(7);
        linkedList.append(6);
        //Act
        linkedList.selectionSort();
        //Assert

        linkedList.printList();
    }

    @Test
    void insertionSort() {
        //Arrange
        linkedList = new LinkedList(4);
        linkedList.append(8);
        linkedList.append(7);
        linkedList.append(6);
        //Act
        linkedList.insertionSort();
        //Assert

        linkedList.printList();
    }
}
