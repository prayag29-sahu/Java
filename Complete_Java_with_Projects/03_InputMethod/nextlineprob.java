
import java.util.Scanner;

public class nextlineprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Number : "+a);
        String str = sc.nextLine();
        System.out.println("name : "+str);

        sc.close();
    }    
}
/*
Enter number : 4
Number : 4
name :
 */