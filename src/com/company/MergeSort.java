package com.company;

import java.util.Arrays;

class MergeSort {

    static int[] mergeSort(int[] array) {
        //basic case
        if (array.length == 1) {
            return array;
        }

        //body of function
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, array.length/2));
        int[] right = mergeSort(Arrays.copyOfRange(array, array.length/2, array.length));
        int indexRight = 0, indexLeft = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexLeft == left.length) {
                array[i] = right[indexRight];
                indexRight++;
            } else if (indexRight == right.length) {
                array[i] = left[indexLeft];
                indexLeft++;
            } else if (left[indexLeft] > right[indexRight]) {
                array[i] = right[indexRight];
                indexRight++;
            } else {
                array[i] = left[indexLeft];
                indexLeft++;
            }
        }
        //recursion step
        return array;
    }
}
