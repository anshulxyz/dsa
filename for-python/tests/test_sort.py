import pytest
from for_python.sort import bubble_sort, selection_sort


@pytest.mark.parametrize(
    "arr",
    [
        ([]),
        ([1]),
        ([1, 2]),
        ([1, 2, 3]),
        ([3, 2, 1]),
        ([9, 1, 2, 3, 4]),
        ([5, 4, 3, 2, 1]),
    ],
)
def test_bubble_sort(arr):
    assert bubble_sort(arr) == sorted(arr)


@pytest.mark.parametrize(
    "arr",
    [
        ([]),
        ([1]),
        ([1, 2]),
        ([1, 2, 3]),
        ([3, 2, 1]),
        ([9, 1, 2, 3, 4]),
        ([5, 4, 3, 2, 1]),
    ],
)
def test_selection_sort(arr):
    assert selection_sort(arr) == sorted(arr)
