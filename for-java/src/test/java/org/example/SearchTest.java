package org.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    Search search = new Search();

    @Test
    void linearSearch() {
        assertEquals(search.linearSearch(new int[]{1, 2, 3, 4}, 1), Optional.of(0));
        assertEquals(search.linearSearch(new int[]{1, 2, 3, 4}, 2), Optional.of(1));
        assertEquals(search.linearSearch(new int[]{1, 2, 3, 4}, 4), Optional.of(3));
        assertEquals(search.linearSearch(new int[]{1, 2, 3, 4}, 5), Optional.empty());
    }

    @Test
    void binarySearch() {
        // Test case 1: Empty array
        assertEquals(Optional.empty(), search.binarySearch(new int[]{}, 1));

        // Test case 2: Single element array
        assertEquals(Optional.of(0), search.binarySearch(new int[]{5}, 5));
        assertEquals(Optional.empty(), search.binarySearch(new int[]{5}, 1));

        // Test case 3: Element not in array
        assertEquals(Optional.empty(), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 6));
        assertEquals(Optional.empty(), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 0));

        // Test case 4: Element at the beginning
        assertEquals(Optional.of(0), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 1));

        // Test case 5: Element at the end
        assertEquals(Optional.of(4), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 5));

        // Test case 6: Array with even number of elements
        assertEquals(Optional.of(0), search.binarySearch(new int[]{1, 2, 3, 4}, 1));
        assertEquals(Optional.of(1), search.binarySearch(new int[]{1, 2, 3, 4}, 2));
        assertEquals(Optional.of(2), search.binarySearch(new int[]{1, 2, 3, 4}, 3));
        assertEquals(Optional.of(3), search.binarySearch(new int[]{1, 2, 3, 4}, 4));
        assertEquals(Optional.empty(), search.binarySearch(new int[]{1, 2, 3, 4}, 5));

        // Test case 7: Array with odd number of elements
        assertEquals(Optional.of(0), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 1));
        assertEquals(Optional.of(1), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 2));
        assertEquals(Optional.of(2), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
        assertEquals(Optional.of(3), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 4));
        assertEquals(Optional.of(4), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 5));
        assertEquals(Optional.empty(), search.binarySearch(new int[]{1, 2, 3, 4, 5}, 6));

        // Test case 8: Array with duplicate elements
        assertEquals(Optional.of(2), search.binarySearch(new int[]{1, 2, 3, 3, 4, 5}, 3));
    }
}