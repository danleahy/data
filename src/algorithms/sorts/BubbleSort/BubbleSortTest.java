package algorithms.sorts.BubbleSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BubbleSortTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void bubbleSort() {
        int[] array = {10, 202, 3, 40, 50};

        BubbleSort.bubbleSort(array);

        System.out.println(array);

        int[] expected = {3, 10, 40, 50, 202};
        assertArrayEquals(expected, array);
    }
}
