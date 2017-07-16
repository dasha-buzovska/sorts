package com.company;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by user on 03.07.2017.
 */

public class SelectTest {
    @Test
    public void selectSort() throws Exception {
        assertArrayEquals(new int[]{1,2,3,4,5}, Select.selectSort(new int[]{2,5,4,1,3}));
        assertArrayEquals(new int[]{1,1,5,100,100}, Select.selectSort(new int[]{1,100,5,1,100}));
    }


}