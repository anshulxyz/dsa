package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void testBubbleSort_typicalUnsortedArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testBubbleSort_alreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testBubbleSort_reverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testBubbleSort_arrayWithDuplicates() {
        int[] arr = {5, 1, 4, 2, 8, 5, 4};
        int[] expected = {1, 2, 4, 4, 5, 5, 8};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testBubbleSort_arrayWithNegativeNumbers() {
        int[] arr = {-10, 20, -30, 5, 0};
        int[] expected = {-30, -10, 0, 5, 20};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testBubbleSort_emptyArray() {
        int[] arr = {};
        int[] expected = {};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testBubbleSort_singleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }
}
