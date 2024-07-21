package example

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should._


class SortSpec extends AnyFreeSpec with Matchers {
  "selection" - {
    "selectionSort should return a sorted array" in {
      val sortData = List(
        Array(1),
        Array(2,1),
        Array(3,1,2),
        Array(3,2,1),
        Array(9,1,2,3,4,5),
        Array(5,4,3,2,1,0)
      )
      sortData.foreach( arr => {
        SortingAlgorithms.selectionSort(arr) shouldEqual arr.sorted
      })
    }
  }

  "insertionSort should" - {
    "return a sorted array" in {
      val sortData = List(
        Array[Int](),  // Empty array
        Array(1),  // Single-element array
        Array(1, 2, 3, 4, 5),  // Already sorted array
        Array(5, 4, 3, 2, 1),  // Reverse sorted array
        Array(3, 3, 3, 3, 3),  // Array with all elements the same
        Array(2, 1),  // Array with two elements
        Array(4, 2, 3, 4, 1, 2),  // Array with repeated elements
        Array(-3, 5, -1, 0, 2, -4),  // Array with negative numbers
        Array(1000000, 10, 999999, 100, 5),  // Array with large numbers
        Array(-5, 7, 0, -3, 2, 1, -1),  // Array with a mix of positive and negative numbers
        Array(1, 3, 2, 4, 5, 6),  // Nearly sorted array
        Array(1, 0, 1, 0, 1, 1, 0),  // Array with only two distinct values
        Array(8, 2, 5, 3, 9, 1, 7, 6, 4),
      )
      sortData.foreach( arr => {
        SortingAlgorithms.insertionSort(arr) shouldEqual arr.sorted
      })
    }
  }

  "bubbleSort should" - {
    "return a sorted array" in {
      val sortData = List(
        Array(1),
        Array(2,1),
        Array(3,1,2),
        Array(3,2,1),
        Array(9,1,2,3,4,5)
      )
      sortData.foreach( arr => {
        SortingAlgorithms.bubbleSort(arr) shouldEqual arr.sorted
      })
    }
  }

  "swap should" - {
    "return array with swapped values" in {
      val testData = List(
        (Array(1), 0, 0, Array(1)),
        (Array(1,2,3), 0, 2, Array(3,2,1)),
        (Array(4,5,6,7,8,9), 1, 3, Array(4,7,6,5,8,9)),
      )
      testData.foreach( data => {
        SortingAlgorithms.swap(data._1, data._2, data._3) shouldEqual data._4
      })
    }
  }
}
