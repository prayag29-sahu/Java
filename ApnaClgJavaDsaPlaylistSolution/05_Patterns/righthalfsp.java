
public class righthalfsp {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        /*
            14>
        * 
      * * 
    * * * 
  * * * *
* * * * *
         */
        for(int i=m;i>=1;i--)
        {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= m - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
