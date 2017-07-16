package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 14.07.2017.
 */
public class MergeSortTest {
    @Test
    public void mergeSort() throws Exception {
        Assert.assertArrayEquals(new int[]{1,2,3,3,4,4,4,5,5,6,7,9,9}, MergeSort.mergeSort(new int[]{4,1,2,5,6,7,3,4,9,3,5,9,4}));
    }

}