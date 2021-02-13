package com.homel.leetcode.samples;

import java.util.Arrays;

public class SortArray {
    // Bubble sort
//    public int[] sortArray(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - i - 1; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    swap(nums, j, j + 1);
//                }
//            }
//        }
//
//        return nums;
//    }
//
//    private void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//terminate execution if array length is 0

        if (low >= high)
            return;//terminate if there is already nothing to share

        // select pivot element
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // split into subarrays which is larger and smaller than the pivot
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//swap items
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // calling recursion to sort the left and right side
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }


    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        quickSort(nums, low, high);
        return nums;
    }


    public static void main(String[] args) {
        SortArray sortArray = new SortArray();

        int[] arr = new int[] {9, 8, 7, 5, 1, 1, 0};
        int[] result = sortArray.sortArray(arr);

        Arrays.stream(result).forEach(System.out::println);


    }
}


