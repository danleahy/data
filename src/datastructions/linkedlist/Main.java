package datastructions.linkedlist;


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(10);
        myLinkedList.printList();

        myLinkedList.removeLast();
        printHeadTail(myLinkedList);

    }

    private static void printHeadTail(LinkedList myLinkedList) {
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
    }

}
