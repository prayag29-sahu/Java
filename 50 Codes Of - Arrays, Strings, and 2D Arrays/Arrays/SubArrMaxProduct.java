public class SubArrMaxProduct {
        public static void main(String[] args) {
        int[] arr = {5, 4, 20, 3, 10, 5};
        int k = 240;

        int start = 0, end = 0, currentPro = 1;
        boolean found = false;

        while (end < arr.length) {
            currentPro *= arr[end];
            while (currentPro > k && start <= end) {
                currentPro /= arr[start];
                start++;
            }
            if (currentPro == k) {
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
            System.out.println("No subarray found with the given Product.");
        }
    }
}
// o/p 4 20 3