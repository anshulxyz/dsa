from typing import List, Optional


def linear_search(arr: List[int], target: int) -> Optional[int]:
    for i, v in enumerate(arr):
        if v == target:
            return i
        elif v > target:
            return None
    return None


def binary_search(arr: List[int], target: int) -> Optional[int]:
    lower = 0
    upper = len(arr) - 1
    while lower <= upper:
        mid = (lower + upper) // 2
        if arr[mid] == target:
            return mid
        elif target < arr[mid]:
            upper = mid - 1
        else:
            lower = mid + 1
    return None
