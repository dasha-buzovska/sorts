package com.company.reverseOrder;

/**
 * Created by user on 09.08.2017
 */
class Comparator {
    public int compare(int a, int b){
        if (a>b) {
            return 1;
        } else if (a == b){
            return 0;
        } else {
            return -1;
        }
    }
}

