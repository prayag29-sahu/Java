import java.util.Scanner;

public class UnionIntersection {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of both Array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the Second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Union: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }

        System.out.print("\nIntersection: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
/*
Enter size of both Array: 3
Enter the elements of the first array:
12 
23
34
Enter the elements of the Second array:
23
12
45
Union: 12 23 34 45
Intersection: 12 23
 */