
import java.util.Scanner;

public class matchInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);
        switch (input) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' ->
                System.out.println(input + " is a vowel.");
            default ->
                System.out.println(input + " is not a vowel.");

        }
    }
}
