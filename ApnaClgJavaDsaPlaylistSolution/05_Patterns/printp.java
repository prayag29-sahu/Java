
import java.util.Scanner;

public class printp {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //  7
        m = sc.nextInt(); //  5

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0
                        || 
                        (i == 0 && j < m - 1)
                        || 
                        (i == n / 2 && j < m - 1)
                        ||
                        (j == m - 1 && i > 0 && i < n / 2) 
                        ) {
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
7
5
**** 
*   *
*   *
****
*
*
*
 */