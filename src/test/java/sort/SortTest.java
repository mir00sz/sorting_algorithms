package sort;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {

    private int[] arr1;
    private int[] arr2;
    private int[] arr3;
    private int[] arr4;

    private static final Logger LOGGER = Logger.getLogger(SortTest.class);


    @Before
    public void setUp() {
        arr1 = new int[]{10, 12, 17, 5, 17, 6, 19, 13, 19, 19, 12, 17, 1, 3, 3, 12, 16, 16, 18, 9};
        arr2 = new int[]{19, 6, 2, 17, 8, 19, 13, 14, 16, 4, 14, 10, 10, 15, 19, 16, 15, 3, 5, 11};
        arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        arr4 = new int[]{20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    }

    @Test
    public void selectionSortTest() {

        LOGGER.info("SELECTION SORT TEST");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr1);
        selectionSort.sort(arr2);
        selectionSort.sort(arr3);
        selectionSort.sort(arr4);

        printTables();
        assertTrue(areArraysSoretd());


    }

    @Test
    public void insertionSort() {
        LOGGER.info("INSERT SORT TEST");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr1);
        insertionSort.insertionSort(arr2);
        insertionSort.insertionSort(arr3);
        insertionSort.insertionSort(arr4);

        printTables();
        assertTrue(areArraysSoretd());

    }


    /////////////////////////HELPERS///////////////////////
    private void printTables() {
        LOGGER.info("Arr1: " + Arrays.toString(arr1));
        LOGGER.info("Arr2: " + Arrays.toString(arr2));
        LOGGER.info("Arr3: " + Arrays.toString(arr3));
        LOGGER.info("Arr4: " + Arrays.toString(arr4));
    }

    private boolean areArraysSoretd() {
        return isArraySorted(arr1) &&
                isArraySorted(arr2) &&
                isArraySorted(arr3) &&
                isArraySorted(arr4);
    }

    private boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
