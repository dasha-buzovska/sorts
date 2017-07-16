package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 14.07.2017.
 */
public class InsertTest {
    @Test
    public void insertSort() throws Exception {
        int[] array = new int[]{1,2,3,4,5,6};
        int[] array1 = new int[]{2,3,1,6,5,4};
        Assert.assertArrayEquals(array, Insert.insertSort(array1));
    }

    @Test
    public void minimum() throws Exception {
        int[] array = new int[]{1,2,3,4,5,6};
        Assert.assertEquals(1, Insert.minimum(array));
    }

}