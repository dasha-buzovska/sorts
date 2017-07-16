package com.company;

import java.util.Arrays;

class Quick {

    static int[] quickSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        //choose pivot element
        int pivot = array[array.length - 1];
        int indicator = 0; //we need indicator for know where to run next, "1" is for right, "0" for left
        int localIndexLeft = 0, localIndexRight = array.length - 1;
        //here, in the loop, we wait when both index will be same
        while (localIndexRight - localIndexLeft > 0) {
            //choose if we are left
            if (indicator == 0) {
                if (array[localIndexLeft] < pivot) {
                    localIndexLeft++; //run next element if nothing changes
                } else {
                    array[localIndexRight] = array[localIndexLeft];
                    array[localIndexLeft] = pivot;
                    indicator = 1; localIndexRight--; //change indicator for run from right side
                }
                //here we do the same things for right side of array
            } else if (array[localIndexRight] > pivot) {
                localIndexRight--;
            } else {
                array[localIndexLeft] = array[localIndexRight];
                array[localIndexRight] = pivot;
                indicator = 0; localIndexLeft++;
            }
        }
        if (localIndexLeft == 0) {
            localIndexLeft++;
        }
        int[] left = quickSort(Arrays.copyOfRange(array, 0, localIndexLeft));
        int[] right = quickSort(Arrays.copyOfRange(array, localIndexRight + 1, array.length));
        int[] result = new int[array.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length + 1, right.length);
        return result;
    }
}
