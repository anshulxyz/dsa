import pytest

def swap(l, x, y):
    l[x],l[y] = l[y],l[x]

    return l

def bubble_sort(arr: list[int]) -> list[int]:
    raise NotImplementedError

def test_swap():
    test_list = [1,2,3]
    test_list = swap(test_list, 0, 2)

    assert test_list[0] == 3
    assert test_list[2] == 1

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
