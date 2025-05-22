
import java.util.Scanner;

public class UperCaseNullStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        try {
            String str1 = str.toUpperCase();
            System.out.println(str1);
        } catch (Exception e) {
            System.out.println("Exeption : "+e);
        }
        System.out.println("also handel null case string");

    }
}
