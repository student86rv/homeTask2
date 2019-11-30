package ua.epam.homeTask2;

import java.util.Arrays;

public class IntAsArray {

    private int[] arr;

    public IntAsArray() {
    }

    public IntAsArray(int intNumber) {
        this.arr = setAsArr(intNumber);
    }

    public int[] setAsArr(int intNumber) {
        int length = (int)Math.log10(intNumber) + 1;
        int[] arr = new int[length];
        int i = length - 1;
        while (intNumber != 0) {
            arr[i] = intNumber % 10;
            intNumber = intNumber / 10;
            i--;
        }
        return arr;
    }

    public void addInt(int number) {
        int i = arr.length - 1;
        while (number != 0) {
            int tmp = arr[i] + number % 10;
            if (tmp >= 10) {
                arr[i] = tmp % 10;
                arr[i - 1] += tmp / 10;
            } else {
                arr[i] = tmp;
            }
            number = number / 10;
            i--;
        }
    }

    public int getAsInt() {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int exp = arr.length - 1 - i;
            result += arr[i] * Math.pow(10, exp);
        }
        return result;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public String toString() {
        return "IntAsArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
