from typing import Optional
import pytest


def binary_search(array: list, target: int) -> Optional[int]:
    raise NotImplementedError


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
