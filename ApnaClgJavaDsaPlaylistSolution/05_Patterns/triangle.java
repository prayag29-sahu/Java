
public class triangle {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        /*
            6>
               *
              * *
             * * *
            * * * *
         */
        for(int i=n;i>=1;i--)
        {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
