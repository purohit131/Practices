package com.pankaj.selflearning.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        int i = 20;
        //int foundIndex = iterativeBinarySearch(intArray, i);

        int foundIndex = recursiveBinarySearch(intArray, i);
        if (foundIndex != -1) {
            System.out.println("Item Found at index " + foundIndex);
        } else {
            System.out.println("Item Not Found");
        }

    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (input[mid] == value) {
                return mid;
            } else if (input[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return binarySearch(input, 0, input.length, value);
    }

    public static int binarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (input[mid] == value) {
            return mid;
        } else if (input[mid] < value) {
            return binarySearch(input, mid + 1, end, value);
        } else {
            return binarySearch(input, start, mid, value);
        }
    }
}
