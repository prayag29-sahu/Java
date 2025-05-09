public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);// 0,1,-2,4,3,5,6,1,5
            maxSum = Math.max(maxSum, currentSum);// 0,1,1,4,4,5,6,6,6
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum); // o/p: 6
    }
}
// Maximum Subarray Sum: 6