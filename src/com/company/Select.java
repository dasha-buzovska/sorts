package com.company;

class Select {

    static int[] selectSort(int[] array) {
        int startOfArr = 0;
        int buffer;
        while (startOfArr < array.length - 1) {
            for (int i = startOfArr+1; i < array.length; i++) {
                if (array[i] < array[startOfArr]) {
                    buffer = array[i];
                    array[i] = array[startOfArr];
                    array[startOfArr] = buffer;
                }
            }
            startOfArr++;
        }
        return array;
    }
}
