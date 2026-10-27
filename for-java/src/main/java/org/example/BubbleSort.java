package org.example;

import java.util.Objects;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        Objects.requireNonNull(arr);
        var swapped = true;
        var k = 1;

        while (swapped) {
            swapped = false;
            for (var i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    var temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            k++;
        }
    }
}
