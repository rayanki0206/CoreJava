package ExampleProblems;

public class SlidingWindow {
	public static int maxSubarraySum(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Expand the window by adding the next element
            windowSum += arr[i];

            // If the window size is larger than 'k', shrink the window from the left
            if (i >= k) {
                windowSum -= arr[i - k];
            }

            // Update the 'maxSum' if the current window sum is greater
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;  // Window size
        int result = maxSubarraySum(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is " + result);
    }
}

