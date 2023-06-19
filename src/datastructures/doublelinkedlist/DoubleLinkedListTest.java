package datastructures.doublelinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    DoubleLinkedList list;

    @BeforeEach
    void setUp() {

        list = new DoubleLinkedList(5);
    }

    @Test
    void append() {
        //Arrange
        list.printList();
        //Act
        list.append(6);
        //Assert
        assertEquals(2, list.length);
    }

    @Test
    void appendArray() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(2,3,4);

        list.printList();
        //Act
        list.append(6);
        //Assert
        assertEquals(4, list.length);
        list.printList();
    }

    @Test
    void removeLast() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(2,3,4);

        list.printList();
        //Act
        DoubleLinkedList.Node lastNode = list.removeLast();
        System.out.println(lastNode);
        //Assert
        assertEquals(2, list.length);
        list.printList();
    }

    @Test
    void removeLastNull() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList();

        //Act
        list.removeLast();
        //Assert
        assertEquals(0, list.length);
    }

    @Test
    void removeLastNodeOnceItem() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1000);

        //Act
        DoubleLinkedList.Node lastNode = list.removeLast();
        //Assert
        assertEquals(0, list.length);
        assertEquals(1000, lastNode.value);
    }

    @Test
    void prePend() {

        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1000);

        //Act
        DoubleLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertEquals(2, list.length);
        assertEquals(100, list.head.value);
    }

    @Test
    void prePendMultiple() {

        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1000,2,3,4,5);

        //Act
        DoubleLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertEquals(6, list.length);
        assertEquals(100, list.head.value);
    }
    @Test
    void prePendEmptyList() {

        //Arrange
        DoubleLinkedList list = new DoubleLinkedList();

        //Act
        DoubleLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertEquals(1, list.length);
        assertEquals(100, list.head.value);
    }

}
