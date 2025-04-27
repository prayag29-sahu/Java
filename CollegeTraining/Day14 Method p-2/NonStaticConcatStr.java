import java.util.Scanner;

public class NonStaticConcatStr {
        String concat(String s){
        return "Hello,"+s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        NonStaticConcatStr s = new NonStaticConcatStr();
        System.out.println(s.concat(str));

    }
    
}
/*
World
Hello,World
 */