package datastructures.stack.leetcode.sortedStack;

public class Node {

    private int value;
    private datastructures.stack.Node next;

    Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public datastructures.stack.Node getNext() {
        return next;
    }

    public void setNext(datastructures.stack.Node next) {
        this.next = next;
    }
}
