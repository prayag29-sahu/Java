
public class rombous {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
 
                /*
            11>
                  ******
                ******
              ******
            ******
         */
        for(int i=n;i>=1;i--)
        {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}
