package com.pankaj.selflearning.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before sort :");
        System.out.print("[");
        for (int j : inputArray) {
            System.out.print(j + ",");
        }
        System.out.print("]");
        System.out.println();

        quickSort(inputArray, 0, inputArray.length);

        System.out.println("Array After sort :");
        for (int j : inputArray) {
            System.out.print(j + ",");
        }
        System.out.println();
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        //considering 1st element as pivot
        int pivot = input[start];

        int i = start;
        int j = end;

        while (i < j) {
            //empty loop boby
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }
}
