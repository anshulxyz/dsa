package org.example;

import java.util.Optional;

public class Search {
    public Optional<Integer> linearSearch(int[] list, int value){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return Optional.of(i);
            }
        }

        return Optional.empty();
    }

    public Optional<Integer> binarySearch(int[] list, int value){
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == value) {
                return Optional.of(mid);
            } else if (list[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return Optional.empty();
    }
}
