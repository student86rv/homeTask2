package ua.epam.homeTask2;

public class TwoNumbers {

    public static int[] twoNumbers(int[] arr, int target) {
        int[] indices = {-1, -1}; // no solutions
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        indices[0] = i;
                        indices[1] = j;
                        break;
                    }
                }
            }
        }
        return indices;
    }
}
