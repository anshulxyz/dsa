package org.example;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp_val = arr[i];
            int position = i - 1;

            while (position >= 0) {
                if (arr[position] > temp_val) {
                    arr[position + 1] = arr[position];
                    position--;
                } else {
                    break;
                }
            }
            arr[position + 1] = temp_val;
        }
        return arr;
    }
}
