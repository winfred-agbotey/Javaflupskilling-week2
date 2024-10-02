package org.example.sorting_searching_alg.sorting_alg;

import java.util.Arrays;

import static org.example.sorting_searching_alg.sorting_alg.SortingAlgorithm.bubbleSort;
import static org.example.sorting_searching_alg.sorting_alg.SortingAlgorithm.selectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 100, 25, 12, 22, 11};
        //bubble sort
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


        //selection sort
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
