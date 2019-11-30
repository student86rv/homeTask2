package ua.epam.homeTask2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoNumbersTest {

    @Test
    public void testTwoNumbers() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoNumbers.twoNumbers(arr, target);
        int[] expected = {0, 1};
        assertArrayEquals(result, expected);
    }

    @Test
    public void testTwoNumbersIfNone() {
        int[] arr = {2, 8, 11, 15};
        int target = 9;
        int[] result = TwoNumbers.twoNumbers(arr, target);
        int[] expected = {-1, -1};
        assertArrayEquals(result, expected);
    }
}
