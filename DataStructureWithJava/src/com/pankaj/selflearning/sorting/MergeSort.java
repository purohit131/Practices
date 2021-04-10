package com.pankaj.selflearning.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before sort :");
        System.out.print("[");
        for (int j : inputArray) {
            System.out.print(j + ",");
        }
        System.out.print("]");
        System.out.println();

        mergeSort(inputArray, 0, inputArray.length);

        System.out.println("Array After sort :");
        for (int j : inputArray) {
            System.out.print(j + ",");
        }
        System.out.println();
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid & j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
