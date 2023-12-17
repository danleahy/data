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

    public int getFirst(){
        return first.getValue();
    }

    public int getLast(){
        return last.getValue();
    }

    public int getLength(){
        return length;
    }

    public void printQueue(){
        Node temp = first;

        while(temp!=null){
            System.out.println(temp.getValue() );
            temp = temp.getNext();
        }


    }

}
