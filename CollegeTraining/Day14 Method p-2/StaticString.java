import java.util.Scanner;

public class StaticString {

    static String concat(String s){
        return "Hello,"+s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(concat(str));

    }
    
}
/*
Ram  
Hello,Ram
 */
