package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 14.07.2017.
 */
public class BubbleTest {
    @Test
    public void newBubbleSort() throws Exception {
        Assert.assertArrayEquals(new int[]{0,1,3,3,4,6,7,8,45}, Bubble.newBubbleSort(new int[]{8,4,3,7,1,0,45,3,6}));
    }

}