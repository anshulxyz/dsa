import pytest


def merge_sort(arr: list[int]) -> list[int]:
    # TODO: implement merge sort
    raise NotImplementedError


@pytest.mark.parametrize("input_list, expected", [
    ([], []),
    ([1], [1]),
    ([3, 2, 1], [1, 2, 3]),
    ([5, 5, 5], [5, 5, 5]),
    ([-4, 3, -2], [-4, -2, 3]),
    ([9, 8, 7, 6], [6, 7, 8, 9]),
    ([2, 1, 3, 5, 4], [1, 2, 3, 4, 5]),
    ([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]),  # already sorted
    ([5, 4, 3, 2, 1], [1, 2, 3, 4, 5]),  # reverse sorted
])
def test_merge_sort(input_list, expected):
    assert merge_sort(input_list) == expected
