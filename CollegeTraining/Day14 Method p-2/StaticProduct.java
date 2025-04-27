import java.util.Scanner;

public class StaticProduct {

    static int product(int n,int m){
        return n*m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a, b));
        sc.close();
    }
    
}
/*
5
6
30
 */
