package org.example.sorting_searching_alg.searching_alg;

public class SearchAlgorithm {

    /**
     * Linear search return the index when the search element is found.
     * It goes through the items sequentially to find the target element.
     * Time Complexity:
     * Best Case: O(1) (when the element is the first one).
     * Average/Worst Case: O(n), where n is the size of the array.
     */


    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search works on sorted arrays. It divides the search range in half repeatedly until the target is found.
     * Time Complexity:
     * Best Case: O(1) (when the element is in the middle).
     * Worst Case: O(log n), where n is the number of elements.
     */
    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (target < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else if (target > arr[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }


        return -1;
    }


}
