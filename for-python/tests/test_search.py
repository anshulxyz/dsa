# tests/test_search_algorithms.py

import pytest
from for_python.search import linear_search, binary_search


# Test cases for Linear Search
@pytest.mark.parametrize(
    "arr, target, expected",
    [
        ([1, 2, 3, 4, 5], 3, 2),
        ([1, 2, 3, 4, 5], 6, None),
        ([], 1, None),
        ([1, 2, 3, 4, 5], 1, 0),
        ([1, 2, 3, 4, 5], 5, 4),
    ],
)
def test_linear_search(arr, target, expected):
    assert linear_search(arr, target) == expected


# Test cases for Binary Search
@pytest.mark.parametrize(
    "arr, target, expected",
    [
        ([1, 2, 3, 4, 5], 3, 2),
        ([1, 2, 3, 4, 5], 6, None),
        ([], 1, None),
        ([1, 2, 3, 4, 5], 1, 0),
        ([1, 2, 3, 4, 5], 5, 4),
    ],
)
def test_binary_search(arr, target, expected):
    assert binary_search(arr, target) == expected
