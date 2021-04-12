package com.pankaj.selflearning.sorting;

public class InsertionSortWithRecursion {
    public static void main(String[] args) {
        int[] inputArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Array Before sort :");
        for (int j : inputArray) {
            System.out.println(j);
        }
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < inputArray.length; firstUnsortedIndex++) {
//            int newElement = inputArray[firstUnsortedIndex];
//            int i;
//            for (i = firstUnsortedIndex; i > 0 && inputArray[i - 1] > newElement; i--) {
//                inputArray[i] = inputArray[i - 1];
//            }
//            inputArray[i] = newElement;
//        }
        insertionSort(inputArray, inputArray.length);

        System.out.println("Array After sort :");
        for (int j : inputArray) {
            System.out.println(j);
        }
    }

    public static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }
        insertionSort(input, numItems - 1);
        int newElement = input[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;

        System.out.println("Result of calls when numItems" + numItems);
        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("--------------------------------");
    }
}
