package com.pankaj.selflearning.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before sort :");
        for (int j : inputArray) {
            System.out.println(j);
        }

        for (int sortedIndex = inputArray.length - 1; sortedIndex > 0; sortedIndex--) {
            for (int i = 0; i < sortedIndex; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swap(inputArray, i, i + 1);
                }
            }
        }
        System.out.println("Array After sort :");
        for (int j : inputArray) {
            System.out.println(j);
        }
    }

    private static void swap(int[] ary, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp;
    }
}
