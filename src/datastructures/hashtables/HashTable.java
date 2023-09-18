package datastructures.hashtables;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private int size = 7;
    private final Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public int get(String key) {
        int hash = hash(key);
        Node retrivedNode = dataMap[hash];
        return retrivedNode != null ? retrivedNode.value : 0;
    }

    public void set(String key, int value) {
        int hash = hash(key);

        Node retrivedNode = dataMap[hash];

        if (retrivedNode == null) {
            dataMap[hash] = new Node(key, value);
        } else {
            retrivedNode.value = value;
        }

    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }


    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if (dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }
}
