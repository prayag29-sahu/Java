
import java.util.Scanner;

public class SumEvenposfibbo {

    public static void main(String[] args) {
        int n, a = 0, b = 1, c = 0, sum = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i < n; i = i + 2) {
            a = b;
            b = c;
            c = a + b;
            sum += c;

            a = b;
            b = c;
            c = a + b;
        }

        System.out.println(sum);
        sc.close();
    }
}
/*
7
8
 */