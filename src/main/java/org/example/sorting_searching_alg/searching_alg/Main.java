package org.example.sorting_searching_alg.searching_alg;

import static org.example.sorting_searching_alg.searching_alg.SearchAlgorithm.binarySearch;
import static org.example.sorting_searching_alg.searching_alg.SearchAlgorithm.linearSearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 7, 8, 15, 16, 4, 5, 6, 17, 18, 19, 209, 10, 11, 12, 13, 14};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(linearSearch(numbers, 10));
        System.out.println(binarySearch(sortedArray,9));
    }
}
