import java.util.*;

public class bigOof2n {
    public static void main(String[] args) {

        int n=4;


        // complexity O(n+n) = O(2n) = O(n) worst case
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j=1;j<=n;j++)
        {
            System.out.print(j+" ");
        }

    }
}
