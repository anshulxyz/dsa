package org.example;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
      for (int i = 1; i < arr.length; ++i) {
        int temp = arr[i];
        int pos = i - 1; // immediate left

        while (pos >= 0) {
          if (temp < arr[pos]) {
            arr[pos + 1] = arr[pos];
            --pos;
          } else {
            break;
          }
        }

        arr[pos + 1] = temp;
      }
      return arr;
    }
}
