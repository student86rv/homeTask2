package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntAsArrayTest {

    @Test
    public void testInit() {
        int number = 1234;
        IntAsArray intAsArray = new IntAsArray(number);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(intAsArray.getArr(), expected);
    }

    @Test
    public void testAddOne() {
        int number = 1234;
        IntAsArray intAsArray = new IntAsArray(number);
        intAsArray.addInt(1);
        int[] expected = {1, 2, 3, 5};
        assertArrayEquals(intAsArray.getArr(), expected);
    }

    @Test
    public void testAddOneWithCarry() {
        int number = 1239;
        IntAsArray intAsArray = new IntAsArray(number);
        intAsArray.addInt(1);
        int[] expected = {1, 2, 4, 0};
        assertArrayEquals(intAsArray.getArr(), expected);
    }

    @Test
    public void testAddAnyNumber() {
        int number = 1234;
        IntAsArray intAsArray = new IntAsArray(number);
        intAsArray.addInt(456);
        int[] expected = {1, 6, 9, 0};
        assertArrayEquals(intAsArray.getArr(), expected);
    }

    @Test
    public void testGetAsInt() {
        int number = 1234;
        IntAsArray intAsArray = new IntAsArray(number);
        assertEquals(intAsArray.getAsInt(), number);
    }
}
