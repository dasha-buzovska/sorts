package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 14.07.2017.
 */
public class QuickTest {
    @Test
    public void quickSort() throws Exception {
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, Quick.quickSort(new int[]{2,3,1,6,5,4}));
    }

}