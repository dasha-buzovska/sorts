package com.company;

import java.util.Arrays;

class Insert {

    static void main(String[] args) {
	int[] arr = new int[]{3,5,7,9,3,1,6};
	int[] arr1 = insertSort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    static int[] insertSort(int[] array) {
        int startOfArray = 0;
        int min = minimum(array);
        int i = 0;
        while (startOfArray < array.length - 1) {
            int indicator = 1;
                if (array[i] > array[i+1]) {
                    int buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                    indicator = -1;
                }
                if (min == array[startOfArray]) {
                    startOfArray++;
                    min = minimum(Arrays.copyOfRange(array, startOfArray, array.length));
                    indicator = 1;
                }
            i+=indicator;
        }
        return array;
    }

    static int minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
