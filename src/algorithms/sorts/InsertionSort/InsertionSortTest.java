package algorithms.sorts.InsertionSort;

import algorithms.sorts.SelectionSort.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void insertionSort() {
        //Arrange
        int[] array = {6,4,7,3,2,1};

        int[] expected = {1,2,3,4,6,7};
        //Act
        InsertionSort.insertionSort(array);
        //Assert
        assertArrayEquals(expected,array);
    }
}
