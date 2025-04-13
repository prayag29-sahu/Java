//Implement a method that receives a number and returns the number increased by 10.

import java.util.Scanner;

public class ReturnIncreseNum {
    public static int Increase(int a)
    {
        return 10+a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Increase(num));
        sc.close();
    }
}
/*
 *  o/p (15
        25)
 */