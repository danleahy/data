package datastructures.doublelinkedlist;

import java.util.Arrays;

public class DoubleLinkedList {

    int length;

    Node head;
    Node tail;

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public DoubleLinkedList(int... myArray) {
        Arrays.stream(myArray).forEach(this::append);
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {

        if (head == null) return null;
        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;

            temp.prev = null;
        }
        length--;
        return temp;
    }

    public Node prePend(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
        return newNode;
    }

    public void printList() {
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    final class Node {

        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

    }
}
