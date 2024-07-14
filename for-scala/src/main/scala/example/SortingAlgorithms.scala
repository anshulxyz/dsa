package example

object SortingAlgorithms{
  def bubbleSort(array: Array[Int]): Array[Int] = {
    // 1. Starting from 0, we test the first two consecutive values (x,y)
    // And if the x > y, we swap them.
    // 2. Then we move on the next pair of the consecutive values (at index 1, and 2)
    // 3. We keep swapping and moving to next pairs until the end of the list
    // 4. We start again from the betginning.
    // 5. We keep doing this until we get a clean run from start to end without any swapping

    if (array.size <= 1) {
      return array
    }

    var arr: Array[Int] = array       // creating a mutable clone
    var clean_pass = false

    var first = 0

    // since after the first run we get the largest number at the end,
    // we don't have to check for that number again, which means, after each 'run'
    // the size of the array that we need to check through decreases by 1
    var remaining = arr.size - 1

    while (!clean_pass) {
      // setting it to true so that if it is still true by the end then we know
      // we didn't have to make any 'swap' operations
      clean_pass= true

      for (i <- 0 until remaining) {
        if (arr(i) > arr(i+1)) {
          arr = swap(arr, i, i+1)
          clean_pass = false      // if I had to swap, then it is not a clean pass
        }
      }
      // reducing the length/size that needs to be checked
      remaining -= 1
    }


    arr
  }

  def swap(arr: Array[Int], x: Int, y: Int): Array[Int] = {
    // to replace the elements at x-th position with the y-th
    // x, y should be less than arr.size
    val _x = arr(x)
    arr(x) = arr(y)
    arr(y) = _x
    arr
  }
}
