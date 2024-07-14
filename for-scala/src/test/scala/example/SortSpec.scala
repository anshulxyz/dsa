package example

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should._


class SortSpec extends AnyFreeSpec with Matchers {
  "selectionSort should" - {
    "return a sorted array" in {
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
