package algorithms.sorts.mergesort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static algorithms.sorts.mergesort.MergeSort.merge;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeTest() {
       //Arrange
           int[] array1 = {1,4,5,6};
           int[] array2 = {10,14,5,16};
       //Act
        int[] combined = merge(array1,array2);
       //Assert
        System.out.println(Arrays.toString(combined));
        System.out.println("Length of combined array: " + combined.length);

    }
}
