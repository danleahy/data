package datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] nums = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(findKthSmallest(nums, k));  // Output: 7

    }

    public static List<Integer> streamMax(int[] nums) {
        Heap maxHeap = new Heap();
        List<Integer> maxStream = new ArrayList<>();

        for (int num : nums) {
            maxHeap.insert(num);
            // The heap's root is always the maximum, so we add it to the result list
            maxStream.add(maxHeap.getHeap().get(0));
        }

        return maxStream;
    }

    public static int findKthSmallest(int[] nums, int k) {
        Heap maxHeap = new Heap();

        for (int num : nums) {
            maxHeap.insert(num);
            if (maxHeap.getHeap().size() > k) {
                maxHeap.remove();
            }
        }

        return maxHeap.remove();
    }

}
