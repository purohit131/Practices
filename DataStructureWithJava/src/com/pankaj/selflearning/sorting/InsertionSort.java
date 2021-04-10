package com.pankaj.selflearning.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before sort :");
        for (int j : inputArray) {
            System.out.println(j);
        }
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < inputArray.length; firstUnsortedIndex++) {
            int newElement = inputArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && inputArray[i - 1] > newElement; i--) {
                inputArray[i] = inputArray[i - 1];
            }
            inputArray[i] = newElement;
        }

        System.out.println("Array After sort :");
        for (int j : inputArray) {
            System.out.println(j);
        }
    }
}
