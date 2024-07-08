package example

object SearchAlgorithms{
  def linearSearch(arr: Array[Int], target: Int): Option[Int] = {
    for ((v,k) <- arr.zipWithIndex) {
      if (v == target) {
        return Some(k);
      } else if (v > target) {
        return None;
        // NOTE since we assume that the input array is in sorted order,
        // we don't have to search any further if we encounter a number larger
        // than the 'target'
      }
    }
    return None;
  }
  def binarySearch(arr: Array[Int], target: Int): Option[Int] = {
    var lower = 0 // starts at 0th index
    var upper = arr.length - 1 // I am starting it at the last readable index

    while (lower <= upper) {
      val pointer = (lower + upper) / 2
      val mid_value = arr(pointer)

      if (target == mid_value) {
        return Some(pointer)
      } else if (target < mid_value) {
        upper = pointer - 1
      } else {
        lower = pointer + 1
      }
    }

    None
  }
}
