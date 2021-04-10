package com.pankaj.selflearning.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before sort :");
        for (int j : inputArray) {
            System.out.println(j);
        }
        for (int lastUnsortedIndex = inputArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int larget = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (inputArray[i] > inputArray[larget]) {
                    larget = i;
                }
            }
            swap(inputArray, larget, lastUnsortedIndex);
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
