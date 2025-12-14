package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    InsertionSort insertionSort = new InsertionSort();

    @Test
    void testInsertionSort_typicalUnsortedArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testInsertionSort_alreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testInsertionSort_reverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testInsertionSort_arrayWithDuplicates() {
        int[] arr = {5, 1, 4, 2, 8, 5, 4};
        int[] expected = {1, 2, 4, 4, 5, 5, 8};
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testInsertionSort_arrayWithNegativeNumbers() {
        int[] arr = {-10, 20, -30, 5, 0};
        int[] expected = {-30, -10, 0, 5, 20};
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testInsertionSort_emptyArray() {
        int[] arr = {};
        int[] expected = {};
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testInsertionSort_singleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }
}
