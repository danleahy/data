package algorithms.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

public class QuickSort {


    public static Integer[] quickSort(Integer[] array) {

        if (array.length < 2) {
            return array;
        } else {
            int pivot = array[0];
            Integer[] subArray = copyOfRange(array, 1, array.length - 1);

            Integer[] before = (Integer[]) stream(subArray)
                    .filter(integer -> integer <= pivot).toArray();

            Integer[] after = (Integer[]) stream(subArray)
                    .filter(integer -> integer > pivot).toArray();

            return IntStream.of(quickSort(before) , IntStream.of(pivot), quickSort(after));
        }
    }
}
