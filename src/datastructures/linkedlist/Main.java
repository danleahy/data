package datastructures.linkedlist;


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

myLinkedList.printList();

myLinkedList.reverseBetween(1,3);
myLinkedList.printList();




        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */
    }

    private static void printHeadTail(LinkedList myLinkedList) {
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
    }

}
