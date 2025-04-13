//Write a method that receives two integers and returns their multiplication result.

import java.util.Scanner;

public class ReturnMulti {
        public static int Multi(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println("Multiplicatio : " +Multi(x,y));
    sc.close();
    }
}
/*
 *  o/p (5
        6
        Multiplicatio : 30)
 */