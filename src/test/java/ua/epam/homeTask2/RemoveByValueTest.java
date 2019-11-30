package ua.epam.homeTask2;

import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveByValueTest {

    @Test
    public void testRemoveByValue1() {
        int[] arr = {3, 2, 2, 3};
        int value = 3;
        int result = RemoveByValue.removeByValue(arr, value);
        assertEquals(result, 2);
    }

    @Test
    public void testRemoveByValue2() {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int value = 2;
        int result = RemoveByValue.removeByValue(arr, value);
        assertEquals(result, 5);
    }

    @Test
    public void testRemoveByValueIfNone() {
        int[] arr = {0, 1, 5, 6, 3, 0, 4, 8};
        int value = 2;
        int result = RemoveByValue.removeByValue(arr, value);
        assertEquals(result, 8);
    }
}
