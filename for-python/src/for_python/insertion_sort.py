import pytest


def insertion_sort(arr: list[int]) -> list[int]:

    if (len(arr) < 2):
        return arr

    for i in range(1, len(arr)):
        temp = arr[i]
        pos = i - 1 #immediate left

        while (pos >= 0):
            if (temp < arr[pos]):
                arr[pos + 1] = arr[pos]
                pos -= 1
            else:
                break
        arr[pos+1] = temp # why this +1, check if the "while" block doesn't
        # happen then the temp is going back to where it came from
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
