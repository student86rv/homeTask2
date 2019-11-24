package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxSubArraySumTest {

    @Test
    public void testMaxSubArraySum() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = MaxSubArraySum.maxSubArraySum(arr, 0, arr.length - 1);
        assertEquals(result, 6);
    }

    @Test
    public void testMaxSubArraySumIfSingle() {
        int[] arr = {2};
        int result = MaxSubArraySum.maxSubArraySum(arr, 0, arr.length - 1);
        assertEquals(result, 2);
    }

    @Test
    public void testMaxSubArraySumIfAllNegative() {
        int[] arr = {-8, -10, -3, -4, -11, -9, -5, -7};
        int result = MaxSubArraySum.maxSubArraySum(arr, 0, arr.length - 1);
        assertEquals(result, -3);
    }
}
