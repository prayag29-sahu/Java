import java.util.Scanner;

class DutchFlagProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (only 0s, 1, and 2): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }

        int index = 0;
        while (count0-- > 0) {
            arr[index++] = 0;
        }
        while (count1-- > 0) {
            arr[index++] = 1;
        }
        while (count2-- > 0) {
            arr[index++] = 2;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
