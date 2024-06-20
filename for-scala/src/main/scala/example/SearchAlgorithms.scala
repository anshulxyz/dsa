package example

object SearchAlgorithms{
  def linearSearch(arr: Array[Int], num: Int): Option[Int] = {
    for ((v,k) <- arr.zipWithIndex) {
      if (v == num) {
        return Some(k);
      }
    }
    return None;
  }
}
