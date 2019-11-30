package ua.epam.homeTask2;

public class MaxSubArraySum {

    public static int maxSubArraySum(int arr[], int left, int right) {
        //input: (array[], 0, arr.length - 1)
        if (left == right)
            return arr[left];

        int middle = (left + right) / 2;

        int result = Math.max(maxSubArraySum(arr, left, middle),
                maxSubArraySum(arr, middle + 1, right));
        return Math.max(result, maxTwoPartsSum(arr, left, middle, right));
    }

    private static int maxTwoPartsSum(int arr[], int left, int middle, int right) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = middle; i >= left; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }
        sum = 0;

        for (int i = middle + 1; i <= right; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }
        return leftSum + rightSum;
    }
}
