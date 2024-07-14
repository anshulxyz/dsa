from typing import List


def bubble_sort(arr: List[int]) -> List[int]:
    clean_pass = False
    last_relevent_index = len(arr) - 1

    while not clean_pass:
        clean_pass = True
        for i in range(last_relevent_index):
            if arr[i] > arr[i + 1]:
                arr = swap(arr, i, i + 1)
                clean_pass = False
        last_relevent_index -= 1
    return arr


def selection_sort(arr: List[int]) -> List[int]:
    for i in range(len(arr) - 1):
        current_lowest_index = i
        for j in range(i, len(arr)):
            if arr[j] < arr[current_lowest_index]:
                current_lowest_index = j
        if i != current_lowest_index:
            arr = swap(arr, current_lowest_index, i)
    return arr


def swap(arr: List[int], x: int, y: int) -> List[int]:
    arr[x], arr[y] = arr[y], arr[x]
    return arr
