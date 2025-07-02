import java.util.Scanner;

public class StrInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        String str1 = sc.nextLine();
        System.out.println(str1);
        sc.close();
    }
    
}
/*
Hello
Hello

 */