
public class rectcombo {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        
        /*
            13>
                1
               212
              32123
             4321234
            543212345
         */
        int num;
        for(int i=m;i>=1;i--)
        {
            num = 5;
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
                num--;
            } 
            for (int j = 0; j <= m - i; j++) {
                System.out.print(num);
                num--;
            }
            int a = 2;
            for (int k = 4; k >= i ; k--)
            { 
                System.out.print(a);
                a++;
            }
            System.out.println();
        }

    }
}
