package org.example;

public class BubbleSort {
  public void bubbleSort(int[] arr) {
    if (arr.length < 2) {
      return;
    }


    for (int passNum = 0; passNum < arr.length - 1; ++passNum) {
      boolean cleanPass = true;

      for (int i = 0; i < (arr.length -passNum - 1); ++i) {
        if (arr[i] > arr[i+1]) {
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;

          cleanPass = false;
        }
      }

      if (cleanPass) {
        return;
      }
    }

  }
}
