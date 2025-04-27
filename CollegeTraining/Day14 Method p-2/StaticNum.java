import java.util.Scanner;

public class StaticNum {

    static void num(int n){
        System.out.println("The Number is : "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        num(a);
        sc.close();
    }
}
/*
10
The Number is : 10
 */