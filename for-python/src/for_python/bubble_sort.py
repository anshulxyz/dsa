import pytest


def bubble_sort(arr: list[int]) -> list[int]:
    # assume that that we do not have a clean pass
    clean_pass = False
    length = len(arr) - 1 # the last address that we need to consider

    while (not clean_pass):
        clean_pass = True
        for i in range(length):
            if (arr[i] > arr[i+1]):
                arr[i], arr[i+1] = arr[i+1], arr[i]
                clean_pass = False

    return arr


@pytest.mark.parametrize("input_list, expected",[
    ([], []),
    ([1], [1]),
    ([3, 2, 1], [1, 2, 3]),
    ([5, 5, 5], [5, 5, 5]),
    ([-4, 3, -2], [-4, -2, 3]),
    ([9, 8, 7, 6], [6, 7, 8, 9]),
    ([2, 1, 3, 5, 4], [1, 2, 3, 4, 5])
])
def test_bubble_sort(input_list, expected):
    assert bubble_sort(input_list) == expected
