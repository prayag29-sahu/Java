import java.util.*;
public class bigOofn {
    public static void main(String[] args) {

    // complexity O(10) worst case
    for(int i=1;i<=10;i++)
    {
        System.out.print(i + " ");
    }
    System.out.println();

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // complexity O(n) worst case
    int a=1;
    while(a<=n)
    {
        System.out.print(a + " ");
        a++;
    }
    System.out.println();

    }
}
