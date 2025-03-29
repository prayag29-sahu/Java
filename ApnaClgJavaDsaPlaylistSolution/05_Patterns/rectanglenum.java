
public class rectanglenum {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
     
        /*
            12>
                1 
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5
         */
        int num = 1;
        for(int i=n;i>=0;i--)
        {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }

    }
}
