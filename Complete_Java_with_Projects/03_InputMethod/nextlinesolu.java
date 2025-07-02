
import java.util.Scanner;

public class nextlinesolu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Number : " + a);
        sc.nextLine();
        System.out.print("Enter name : ");
        String str = sc.nextLine();
        System.out.println("name : " + str);

        sc.close();
    }
}
/*
Enter number : 67
Number : 67
Enter name : Om
name : Om
 */