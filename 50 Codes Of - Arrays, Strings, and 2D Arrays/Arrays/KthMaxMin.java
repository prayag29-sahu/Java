import java.util.Scanner;

public class KthMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int kthMin = arr[k - 1];
        int kthMax = arr[n - k];
        System.out.println("The " + k + "th minimum element is: " + kthMin);
        System.out.println("The " + k + "th maximum element is: " + kthMax);

        sc.close();
    }
}
/*
Enter size of Array: 5
Enter the elements of the array:
23
45
12
46
32
Enter the value of k: 2
The 2th minimum element is: 23
The 2th maximum element is: 45
 */