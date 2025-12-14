import pytest


def insertion_sort(arr: list[int]) -> list[int]:
    if len(arr) < 2:
        return arr

    for i in range(1, len(arr)):
        temp_val = arr[i]
        position = i- 1

        while position >= 0:
            if arr[position] > temp_val:
                arr[position + 1] = arr[position]
                position -= 1
            else:
                break # no need to check leftwards anymore

        arr[position + 1] = temp_val
        
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
def test_insertion_sort(input_list, expected):
    assert insertion_sort(input_list) == expected
