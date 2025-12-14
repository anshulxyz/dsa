from typing import Optional
import pytest


def binary_search(array: list, target: int) -> Optional[int]:
    lower_bound = 0
    upper_bound = len(array) - 1

    while lower_bound <= upper_bound:
        mid_index = (lower_bound + upper_bound) // 2
        mid_value = array[mid_index]

        if mid_value == target:
            return mid_index
        elif target < mid_value:
            upper_bound = mid_value - 1
        else:
            lower_bound = mid_index + 1

    return None


@pytest.mark.parametrize(
    "arr, target, expected",
    [
        ([1], 1, 0),  # lower = 0, upper = 1 -1 = 0
        ([1, 2, 3, 4, 5], 3, 2),
        ([1, 2, 3, 4, 5], 6, None),
        ([], 1, None),
        ([1, 2, 3, 4, 5], 1, 0),
        ([1, 2, 3, 4, 5], 5, 4),
    ],
)
def test_binary_search(arr, target, expected):
    assert binary_search(arr, target) == expected
