package datastructures.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    Long length;

    public LinkedList() {
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1L;
    }

    public Node removeLast() {
        if (length == 0) return null;

        Node pre = head;
        Node temp = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else System.out.println("Head: " + head.value);
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) tail = null;
        return temp;
    }

    public Node get(int index) {
        if (length == 0) return null;

        if (index == 0) return head;


        int counter = 0;
        Node temp = head;
        while (temp.next != null) {

            if (counter == index) return temp;
            else {
                counter++;
                temp = temp.next;
            }
        }
        return null;

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


}
