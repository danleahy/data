package datastructures.doublelinkedlist;

import java.util.Arrays;

public class DoublyLinkedList {

    int length;

    Node head;
    Node tail;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public DoublyLinkedList(int... myArray) {
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

    public boolean insert(int index, int value) {
        if (index < 0 || index >= length) return false;


        if (index == 0) {
            prePend(value);
            return true;
        }

        if (index == length - 1) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);

        Node before = get(index - 1);
        Node after = before.next;

        newNode.next = after;
        after.prev = newNode;
        newNode.prev = before;
        before.next = newNode;

        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;

        if (index == 0 ) return removeFirst();

        if (index == length - 1) return removeLast();


        Node temp = get(index);
        Node before = temp.prev;
        Node after = temp.next;

        if (before != null) {
            before.next = after;
        }
        if (after != null) {
            after.prev = before;
        }

        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;


        Node temp = head;

        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;

            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
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

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;


        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
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
