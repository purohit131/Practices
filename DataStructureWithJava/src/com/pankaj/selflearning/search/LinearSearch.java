package com.pankaj.selflearning.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int i = -77;
        int foundIndex = linearSearch(intArray, i);
        if (foundIndex != -1) {
            System.out.println("Item Found at index " + foundIndex);
        } else {
            System.out.println("Item Not Found");
        }
    }

    public static int linearSearch(int[] input, int searchValue) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
