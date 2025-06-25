
import java.util.Scanner;

public class printN {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();  // 5

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
5
*   *
**  *
* * *
*  **
*   *
 */