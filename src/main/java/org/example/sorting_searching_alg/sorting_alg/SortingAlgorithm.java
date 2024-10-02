package org.example.sorting_searching_alg.sorting_alg;

public class SortingAlgorithm {


    /*
    * Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.
    * Time Complexity:
    * Best Case: O(n) (when the array is already sorted).
    * Average/Worst Case: O(n²).

    * */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;// No swaps mean array is already sorted
        }
    }


    /*
     * Selection Sort repeatedly selects the smallest element from the unsorted part of the array and swaps it with the first unsorted element.
     * Time Complexity:
     * Best, Average, and Worst Case: O(n²).
     * Use Case: Simple but inefficient for large datasets.
     *

     * */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // The inner loop should start from i + 1 to find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
