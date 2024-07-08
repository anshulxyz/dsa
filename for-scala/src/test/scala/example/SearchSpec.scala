package example

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should._


class SearchSpec extends AnyFreeSpec with Matchers {
  "linearSearch should" - {
    "return the index of the target element if it exists in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.linearSearch(arr, 5) shouldEqual Some(4)
    }

    "return None if the target element does not exist in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.linearSearch(arr, 10) shouldEqual None
    }

    "return the correct index for the first element in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.linearSearch(arr, 1) shouldEqual Some(0)
    }

    "return the correct index for the last element in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.linearSearch(arr, 9) shouldEqual Some(8)
    }

    "return None for an empty array" in {
      val arr = Array.empty[Int]
      SearchAlgorithms.linearSearch(arr, 1) shouldEqual None
    }

    "return the correct index for a single-element array where the element exists" in {
      val arr = Array(1)
      SearchAlgorithms.linearSearch(arr, 1) shouldEqual Some(0)
    }

    "return None for a single-element array where the element does not exist" in {
      val arr = Array(1)
      SearchAlgorithms.linearSearch(arr, 2) shouldEqual None
    }

  }

  "binarySearch should" - {
    "return the index of the target element if it exists in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.binarySearch(arr, 5) shouldEqual Some(4)
    }

    "return None if the target element does not exist in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.binarySearch(arr, 10) shouldEqual None
    }

    "return the correct index for the first element in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.binarySearch(arr, 1) shouldEqual Some(0)
    }

    "return the correct index for the last element in the array" in {
      val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
      SearchAlgorithms.binarySearch(arr, 9) shouldEqual Some(8)
    }

    "return None for an empty array" in {
      val arr = Array.empty[Int]
      SearchAlgorithms.binarySearch(arr, 1) shouldEqual None
    }

    "return the correct index for a single-element array where the element exists" in {
      val arr = Array(1)
      SearchAlgorithms.binarySearch(arr, 1) shouldEqual Some(0)
    }

    "return None for a single-element array where the element does not exist" in {
      val arr = Array(1)
      SearchAlgorithms.binarySearch(arr, 2) shouldEqual None
    }

  }
}
