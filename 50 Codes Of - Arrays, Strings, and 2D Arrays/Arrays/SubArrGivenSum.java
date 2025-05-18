// 14. Subarray with given sum (Two pointer / Sliding window)

public class SubArrGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int k = 33;

        int start = 0, end = 0, currentSum = 0;
        boolean found = false;

        while (end < arr.length) {
            currentSum += arr[end];
            while (currentSum > k && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == k) {
                found = true;
                System.out.println("Subarray found from index " + start + " to " + end);
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;
            }
            end++;
        }
        if (!found) {
            System.out.println("No subarray found with the given sum.");
        }
    }
}
