
import java.util.Scanner;

public class ArrMaxMinSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int j = 0; j < size; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println(max + min);
    }
}
/*
5
1
3
-2
4
-4
0
 */