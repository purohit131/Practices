package com.pankaj.selflearning.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        System.out.println("Array Before sort :");
        for (int j : intArray) {
            System.out.print(j);
            System.out.print(',');
        }
        System.out.println();

        bucketSort(intArray);

        System.out.println("Array After sort :");
        for (int j : intArray) {
            System.out.print(j);
            System.out.print(',');
        }
        System.out.println();
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int value : input) {
            int key = hasKey(value);
            buckets[key].add(value);
        }
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                input[j++] = value;
            }
        }
    }

    private static int hasKey(int value) {
        return value / 10;
    }
}
