// Write a program to create a method that takes two numbers and prints their difference.

import java.util.Scanner;

public class DifferenceMethod {
    public static int diff(int a,int b)
    {
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        System.out.println("Difference : "+diff(x, y));
        sc.close();
    }
}
/*
 *  o/p (
 * 10
    4
    Difference : 6)
 */