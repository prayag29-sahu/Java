
import java.util.Scanner;

public class Somofevenoddfibboterm {

    public static void main(String[] args) {
        int n, a = 0, b = 1, c = 0;
        int sume = 0; // Sum of even-position terms
        int sumo = 0; // Sum of odd-position terms

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i < n; i = i + 2) {
            sumo += c; // odd position term

            a = b;
            b = c;
            c = a + b;

            sume += c; // even position term

            a = b;
            b = c;
            c = a + b;
        }

        System.out.println(sume);
        System.out.println(sumo);

        if (sume > sumo) {
            System.out.println("sum of even position digits is greater."); 
        }else if (sumo > sume) {
            System.out.println("sum of odd position digits is greater."); 
        }else {
            System.out.println("both sum are equal.");
        }

        sc.close();
    }
}
/*
7
8
4
sum of even position digits is greater.
 */