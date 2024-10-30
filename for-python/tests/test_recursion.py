import pytest
from for_python.recursion import reverse_string


@pytest.mark.parametrize(
    "arr",
    [
        ("abcde"),
    ],
)
def test_sorting_algorithms(arr):
    assert reverse_string(arr) == "".join(reversed(arr))
