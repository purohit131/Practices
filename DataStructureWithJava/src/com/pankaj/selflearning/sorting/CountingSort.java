package com.pankaj.selflearning.sorting;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        System.out.println("Array Before sort :");
        for (int j : intArray) {
            System.out.print(j);
            System.out.print(',');
        }
        System.out.println();

        countingSort(intArray, 1, 10);


        System.out.println("Array After sort :");
        for (int j : intArray) {
            System.out.print(j);
            System.out.print(',');
        }

    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
