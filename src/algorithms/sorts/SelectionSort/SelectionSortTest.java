package algorithms.sorts.SelectionSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void selectionSort() {
        //Arrange
        int[] array = {6,4,7,3,2,1};

        int[] expected = {1,2,3,4,6,7};
        //Act
        SelectionSort.selectionSort(array);
        //Assert
        assertArrayEquals(expected,array);
    }
}
