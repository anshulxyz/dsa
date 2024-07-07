from typing import List, Optional

def linear_search(arr: List[int], target: int) -> Optional[int]:
    for (i, v) in enumerate(arr):
        if v == target:
            return i
        elif v > target:
            return None
        else:
            return None

def binary_search(arr: List[int], target: int) -> Optional[int]:
    return 0
