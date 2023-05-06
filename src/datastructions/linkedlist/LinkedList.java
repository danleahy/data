package datastructions.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    Long length;


    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1L;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    public Node getHead() {
        if (head == null){
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
