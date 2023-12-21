package algorithms.sorts.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                //swap
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }




    public static void main(String[] args) {

        int[] array  = {30,45,1,3,90};

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
