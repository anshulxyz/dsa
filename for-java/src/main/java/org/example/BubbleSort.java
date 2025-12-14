package org.example;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int k = 1;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
