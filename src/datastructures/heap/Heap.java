package datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    public  void insert(int value){
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0){
            swap(current,parent(current));
            current = parent(current);
        }

    }


    private int leftChild(int index){
        return 2 * index + 1 ;
    }

    private int rightChild(int index){
        return 2 * index + 1 ;
    }


    private int parent(int index){
        return (index - 1) / 2 ;
    }

    private void swap(int index1, int index2){
        int temp =
    }
}
