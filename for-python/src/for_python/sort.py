from typing import List
def bubble_sort(arr: List[int]) -> List[int]:
    # setup
    clean_pass = False
    first = 0

    while not clean_pass:
        clean_pass = True
        while first < len(arr) - 1:
            if arr[first] > arr[first + 1]:
                arr = swap(arr, first, first+1)
                clean_pass = False
            first += 1
        first = 0
    return arr

def swap(arr: List[int], x: int, y: int) -> List[int]:
    temp = arr[x]
    arr[x] = arr[y]
    arr[y] = temp
    return arr
