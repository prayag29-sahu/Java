import java.util.Scanner;

public class CheckFactEO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * i;
            }
            if (fact % 2 == 0) {
                System.out.println("Factoral " + fact + " is : Even");
            } else {
                System.out.println("Factoral " + fact + " is : Odd");
            }
        }
        sc.close();
    }

}
/*
 * Factoral 1 is : Odd
 * Factoral 4 is : Even
 * Factoral 27 is : Odd
 * Factoral 256 is : Even
 */