package example

object SearchAlgorithms{
  def linearSearch(arr: Array[Int], num: Int): Option[Int] = {
    for ((v,k) <- arr.zipWithIndex) {
      if (v == num) {
        return Some(k);
      } else if (v > num) {
        return None;
        // NOTE since we assume that the input array is in sorted order,
        // we don't have to search any further if we encounter a number larger
        // than the 'num'
      }
    }
    return None;
  }
}
