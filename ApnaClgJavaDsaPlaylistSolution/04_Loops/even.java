import java.util.*;

public class even {
    public static void main(String[] args) {

    // H.W.
    // 1> Print all even number till n
    System.out.print("Enter any number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i<=n;i=i+2)
    {
        System.out.print(i + " ");
    }

    }
}
