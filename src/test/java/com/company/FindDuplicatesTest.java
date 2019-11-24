package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindDuplicatesTest {

    @Test
    public void testFindDuplicatesTrue() {
        int[] arr = {1, 2, 3, 1};
        boolean found = FindDuplicates.findDuplicates(arr);
        assertTrue(found);
    }

    @Test
    public void testFindDuplicatesFalse() {
        int[] arr = {1, 2, 3, 4};
        boolean found = FindDuplicates.findDuplicates(arr);
        assertFalse(found);
    }

    @Test
    public void testFindDuplicatesTrue2() {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean found = FindDuplicates.findDuplicates(arr);
        assertTrue(found);
    }
}
