
public class pattern {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        /*
            1>
            * * * * * 
            * * * * * 
            * * * * * 
            * * * * * 
         */
        // for(int i=1;i<=n;i++)
        // {
        //     for (int j = 1; j <= m; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*
            2>
            *****
            *   *
            *   *
            *****
         */
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=m;j++)
        //     {
        //         if (i == 1 || j == 1 || i == n || j == m) {
        //             System.out.print("*");
        //         } else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        /*
            3>
            *
            **
            ***
            ****
        
         */
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
            4>
              ****
              ***
              **
              *
         */

        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
            5>
               *
              **
             ***
            ****
         */
        // for(int i=n;i>=1;i--)
        // {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= n - i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
            6>
               *
              * *
             * * *
            * * * *
         */
        // for(int i=n;i>=1;i--)
        // {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= n - i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*
            7>
            1
            12
            123
            1234
            12345
        
         */
        // for(int i=1;i<=m;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

            
        /*
            8>
            12345
            1234
            123
            12
            1
        */
        
        // for (int i = m; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    

                /*
                9>
                    1 
                    2 3
                    4 5 6
                    7 8 9 10
                    11 12 13 14 15
                
                */
        // int num = 1;
        // for(int i=1;i<=m;i++)
        // {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        

        
                /*
                10>
                
                1 
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1
                
                */
        
        // for(int i=1;i<=m;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         if ((i+j) % 2 == 0) {
        //             System.out.print(1+" ");
        //         } else {
        //                     System.out.print(0+" ");
        //         }
        
        //     }
        //     System.out.println();
        // }
    
    
                /*
            11>
                  ******
                ******
              ******
            ******
         */
        // for(int i=n;i>=1;i--)
        // {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 0; j <= m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    

        
        /*
            12>
                1 
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5
         */
        // int num = 1;
        // for(int i=n;i>=0;i--)
        // {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= n - i; j++) {
        //         System.out.print(num + " ");
        //     }
        //     num++;
        //     System.out.println();
        // }


        
        /*
            13>
                1
               212
              32123
             4321234
            543212345
         */
        // int num;
        // for(int i=m;i>=1;i--)
        // {
        //     num = 5;
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //         num--;
        //     } 
        //     for (int j = 0; j <= m - i; j++) {
        //         System.out.print(num);
        //         num--;
        //     }
        //     int a = 2;
        //     for (int k = 4; k >= i ; k--)
        //     { 
        //         System.out.print(a);
        //         a++;
        //     }
        //     System.out.println();
        // }


        /*
            14>
        * 
      * * 
    * * * 
  * * * *
* * * * *
         */
        // for(int i=m;i>=1;i--)
        // {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 0; j <= m - i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


                /*
            15>
             * 
             * *
             *   *
             *     *
             * * * * *
        
         */
        // for(int i=1;i<=m;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         if(j==1||j==i||i==m){
        //             System.out.print("* ");  
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
