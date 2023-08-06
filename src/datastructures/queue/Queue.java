package datastructures.queue;

public class Queue {

    Node first;
    Node last;
    int length;

    Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;

    }

}
