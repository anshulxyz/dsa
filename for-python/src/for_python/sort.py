from typing import List

def bubble_sort(arr: List[int]) -> List[int]:
    clean_pass = False
    last_relevent_index = len(arr)- 1

    while not clean_pass:
        clean_pass = True
        for i in range(last_relevent_index):
            if arr[i] > arr[i + 1]:
                arr = swap(arr, i, i+1)
                clean_pass = False
        last_relevent_index -= 1
    return arr

def swap(arr: List[int], x: int, y: int) -> List[int]:
    temp = arr[x]
    arr[x] = arr[y]
    arr[y] = temp
    return arr
