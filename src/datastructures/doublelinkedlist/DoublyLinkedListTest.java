package datastructures.doublelinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    DoublyLinkedList list;

    @BeforeEach
    void setUp() {

        list = new DoublyLinkedList(5);
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
        DoublyLinkedList list = new DoublyLinkedList(2,3,4);

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
        DoublyLinkedList list = new DoublyLinkedList(2,3,4);

        list.printList();
        //Act
        DoublyLinkedList.Node lastNode = list.removeLast();
        System.out.println(lastNode);
        //Assert
        assertEquals(2, list.length);
        list.printList();
    }

    @Test
    void removeLastNull() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList();

        //Act
        list.removeLast();
        //Assert
        assertEquals(0, list.length);
    }

    @Test
    void removeLastNodeOnceItem() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1000);

        //Act
        DoublyLinkedList.Node lastNode = list.removeLast();
        //Assert
        assertEquals(0, list.length);
        assertEquals(1000, lastNode.value);
    }

    @Test
    void prePend() {

        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1000);

        //Act
        DoublyLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertNotNull(lastNode);
        assertEquals(2, list.length);
        assertEquals(100, list.head.value);
    }



    @Test
    void prePendMultiple() {

        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1000,2,3,4,5);

        //Act
        DoublyLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertNotNull(lastNode);
        assertEquals(6, list.length);
        assertEquals(100, list.head.value);
    }
    @Test
    void prePendEmptyList() {

        //Arrange
        DoublyLinkedList list = new DoublyLinkedList();

        //Act
        DoublyLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertNotNull(lastNode);
        assertEquals(1, list.length);
        assertEquals(100, list.head.value);
    }

    @Test
    void removeFirst() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,4);

        //Act
        list.removeFirst();
        //Assert
        assertEquals(2, list.length);
        assertEquals(2, list.head.value);

    }

    @Test
    void removeFirstEmptyList() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList();

        //Act
        list.removeFirst();
        //Assert
        assertEquals(0, list.length);
        assertNull(list.head);
        assertNull(list.tail);

    }

    @Test
    void get() {

        DoublyLinkedList list = new DoublyLinkedList(1,2,3,4,5,6,7,8,10);

        //Act
        DoublyLinkedList.Node node = list.get(0);
        DoublyLinkedList.Node node1 = list.get(4);
        DoublyLinkedList.Node node3 = list.get(8);
        DoublyLinkedList.Node nullNode = list.get(-1);

        //Assert
        assertEquals(1, node.value);
        assertEquals(5, node1.value);
        assertEquals(10, node3.value);
        assertNull(nullNode);

    }

    @Test
    void set() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3,4,5,6,7,8,10);
        //Act
        list.set(0,100);
        //Assert
        assertEquals(100,list.get(0).value);
    }

    @Test
    void setInvalidIndex() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3,4,5,6,7,8,10);
        //Act
        boolean isSet = list.set(-1, 100);
        //Assert
        assertFalse(isSet);
    }

    @Test
    void insert() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3,4);

        //Act
        boolean inserted = list.insert(0,-99);
        //Assert
        assertTrue(inserted);
        assertEquals(-99,list.get(0).value);

    }

    @Test
    void insertNon0Index() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3,4);

        //Act
        boolean inserted = list.insert(1,-99);
        //Assert
        assertTrue(inserted);
        assertEquals(-99,list.get(1).value);

    }

    @Test
    void remove() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3,4,5);
        //Act
        DoublyLinkedList.Node removedNode = list.remove(4);
        //Assert
        assertEquals(5,removedNode.value);
        assertEquals(4,list.length);
    }

    @Test
    void printList() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3);
        //Act
        list.printList();
        //Assert
        assertTrue(true);
    }

    @Test
    void swapFirstLast() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3);
        //Act
        list.swapFirstLast();
        //Assert
        assertEquals(3, list.head.value);
        assertEquals(1, list.tail.value);
    }

    @Test
    void swapFirstLastNoValue() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList();
        //Act
        list.swapFirstLast();
        //Assert
        assertEquals(0, list.length);
    }

    @Test
    void swapFirstLast1Value() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1);
        //Act
        list.swapFirstLast();
        //Assert
        assertEquals(1, list.head.value);
        assertEquals(1, list.tail.value);
    }

    @Test
    void reverse() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3);
        //Act
        list.reverse();
        //Assert
        assertEquals(3, list.head.value);
        assertEquals(1, list.tail.value);

    }

    @Test
    void isPalindrome() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,3);
        //Act
        boolean isPalindrome = list.isPalindrome();
        //Assert
        assertFalse(isPalindrome);
    }


    @Test
    void isPalindromeTrue() {
        //Arrange
        DoublyLinkedList list = new DoublyLinkedList(1,2,2,1);
        //Act
        boolean isPalindrome = list.isPalindrome();
        //Assert
        assertTrue(isPalindrome);
    }
}
