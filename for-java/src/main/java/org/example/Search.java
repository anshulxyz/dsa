package org.example;

import java.util.Objects;
import java.util.Optional;

public class Search {
    public Optional<Integer> linearSearch(int[] list, int value) {
        Objects.requireNonNull(list);
        for (var i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }

    public Optional<Integer> binarySearch(int[] list, int value) {
        Objects.requireNonNull(list);
        var low = 0;
        var high = list.length - 1;

        while (low <= high) {
            var mid = low + (high - low) / 2;
            switch (Integer.compare(list[mid], value)) {
                case 0 -> {
                    return Optional.of(mid);
                }
                case 1 -> high = mid - 1;
                default -> low = mid + 1;
            }
        }
        return Optional.empty();
    }
}
