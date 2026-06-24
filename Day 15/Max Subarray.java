//Maximum Subarray using Kadane's Algorithm (O(n))
//Given an array of integers (positive, negative, or zero), find the contiguous subarray whose sum is maximum.
class Main {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};

        int currentMax = 0;
        int max = arr[0];

        for (int num : arr) {
            currentMax += num;
            max = Math.max(max, currentMax);

            if (currentMax < 0)
                currentMax = 0;
        }

        System.out.println(max);
    }
}
/*1. currentSum

Stores the maximum sum ending at the current index.

2. maxSum

Stores the overall maximum subarray sum found so far.

Step-by-Step Process

For every element arr[i]:

Step 1: Add the element to currentSum
currentSum += arr[i]
Step 2: Update maxSum

If currentSum > maxSum, then

maxSum = currentSum
Step 3: Reset currentSum if it becomes negative

If

currentSum < 0

then

currentSum = 0

because a negative sum cannot help us achieve a larger sum later.
    */
