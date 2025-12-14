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
        assertEquals(search.binarySearch(new int[]{1, 2, 3, 4}, 1), Optional.of(0));
        assertEquals(search.binarySearch(new int[]{1, 2, 3, 4}, 2), Optional.of(1));
        assertEquals(search.binarySearch(new int[]{1, 2, 3, 4, 5}, 3), Optional.of(2));
        assertEquals(search.binarySearch(new int[]{1, 2, 3, 4}, 4), Optional.of(3));
        assertEquals(search.binarySearch(new int[]{1, 2, 3, 4}, 5), Optional.empty());
    }
}