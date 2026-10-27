package org.example;

import java.util.Objects;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        Objects.requireNonNull(arr);
        for (var i = 1; i < arr.length; i++) {
            var tempVal = arr[i];
            var position = i - 1;

            while (position >= 0 && arr[position] > tempVal) {
                arr[position + 1] = arr[position];
                position--;
            }
            arr[position + 1] = tempVal;
        }
        return arr;
    }
}
