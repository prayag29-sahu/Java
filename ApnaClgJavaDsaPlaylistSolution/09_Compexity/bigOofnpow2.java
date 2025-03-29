
public class bigOofnpow2 {
    public static void main(String[] args) {

            /*
            1>
            * * * * * 
            * * * * * 
            * * * * * 
            * * * * * 
         */
        // complexity O(n*n) = O(n^2) worst case
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
