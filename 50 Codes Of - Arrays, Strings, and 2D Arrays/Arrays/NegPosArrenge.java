import java.util.*;
public class NegPosArrenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
// 3,-2,23,21,-32
// -2,-32,3,23,21
/*
Enter size of Array: 5
Enter the elements of the array:
3
-2
23
21
-32
-2 -32 23 21 3
 */