import pytest


def selection_sort(arr: list[int]) -> list[int]:

    for i in range(len(arr)):
        min_index = i
        for j in range(i, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j

        if min_index != i:
            arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr


@pytest.mark.parametrize(
    "input_list, expected",
    [
        ([], []),
        ([1], [1]),
        ([3, 2, 1], [1, 2, 3]),
        ([5, 5, 5], [5, 5, 5]),
        ([-4, 3, -2], [-4, -2, 3]),
        ([9, 8, 7, 6], [6, 7, 8, 9]),
        ([2, 1, 3, 5, 4], [1, 2, 3, 4, 5]),
    ],
)
def test_selection_sort(input_list, expected):
    assert selection_sort(input_list) == expected
