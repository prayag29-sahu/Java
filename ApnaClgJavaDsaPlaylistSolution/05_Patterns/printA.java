
import java.util.Scanner;

public class printA {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();  //  5

        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                else if (i == n / 2 + 1) {
                    System.out.print("*");
                } else {
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
    *
   * *
  *****
 *     *
*       *
 */