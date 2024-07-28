import pytest
from for_python.sort import bubble_sort, selection_sort, insertion_sort


@pytest.mark.parametrize(
    "arr",
    [
        ([]),  # Empty array
        ([1]),  # Single-element array
        ([1, 2, 3, 4, 5]),  # Already sorted array
        ([5, 4, 3, 2, 1]),  # Reverse sorted array
        ([3, 3, 3, 3, 3]),  # Array with all elements the same
        ([2, 1]),  # Array with two elements
        ([4, 2, 3, 4, 1, 2]),  # Array with repeated elements
        ([-3, 5, -1, 0, 2, -4]),  # Array with negative numbers
        ([1000000, 10, 999999, 100, 5]),  # Array with large numbers
        ([-5, 7, 0, -3, 2, 1, -1]),  # Array with a mix of positive and negative numbers
        ([1, 3, 2, 4, 5, 6]),  # Nearly sorted array
        ([1, 0, 1, 0, 1, 1, 0]),  # Array with only two distinct values
        ([8, 2, 5, 3, 9, 1, 7, 6, 4]),
    ],
)
def test_sorting_algorithms(arr):
    assert bubble_sort(arr) == sorted(arr)
    assert selection_sort(arr) == sorted(arr)
    assert insertion_sort(arr) == sorted(arr)
