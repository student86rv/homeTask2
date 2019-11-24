package com.company;

public class RemoveByValue {

    public static int removeByValue(int[] arr, int value) {
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}
