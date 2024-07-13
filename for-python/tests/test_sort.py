import pytest
from for_python.sort import bubble_sort

@pytest.mark.parametrize("arr", [
    ([]),
    ([1]),
    ([1,2]),
    ([1,2,3]),
    ([3,2,1]),
])
def test_linear_search(arr):
    assert bubble_sort(arr) == sorted(arr)
