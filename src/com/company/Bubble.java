package com.company;

class Bubble {

    static int[] newBubbleSort(int[] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j-1] > array[j]) {
                    buffer = array[j-1];
                    array[j-1] = array[j];
                    array[j] = buffer;
                }
            }
        }
        return array;
    }
}
