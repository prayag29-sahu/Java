public class patterns {
public static void main(String[] args) {
    
    int n=4;
    int m=5;
    
        /*
            1>
             *      *
             **    **
             ***  ***
             ********
             ********
             ***  ***
             **    **
             *      *
         */
        // int s=2*(n-1);
        // int s1 = 0;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     for(int k=1; k<=s;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     s=s-2;
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for(int k=1; k<=s1;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //     s1=s1+2;
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    

        /*
        2>
             *
            * *
           * * *
          * * * *
         * * * * *
         * * * * *
          * * * *
           * * *
            * *
             *
         */
        // for(int i=m;i>=1;i--)
        // {
        //     for(int j=1;j<i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=m-i;k++)
        //     {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=m;i++)
        // {
        //     for(int j=1;j<i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=m-i;k++)
        //     {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }


            /*
            3>
             *              *
             * *          * *
             *   *      *   *
             *     *  *     *
             *     *  *     *
             *   *      *   *
             * *          * *
             *              *
         */
        // int s=2*(n-1);
        // int s1 = 0;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         if(j==1||j==i){
        //             System.out.print("* ");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int k=1; k<=s;k++)
        //     {
        //         System.out.print("  ");
        //     }
        //     s=s-2;
        //     for(int j=1;j<=i;j++)
        //     {
        //         if(j==n||j==i||j==1){
        //             System.out.print(" *");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if(j==1||j==i){
        //             System.out.print("* ");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int k=1; k<=s1;k++)
        //     {
        //         System.out.print("  ");
        //     }
        //     s1=s1+2;
        //     for (int j = 1; j <= i; j++) {
        //         if(j==n||j==i||j==1){
        //             System.out.print(" *");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        /*
            4>
                   * * * * * * 
                 *         *
               *         *
             * * * * * *
         */
        // for(int i=n;i>=1;i--)
        // {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 0; j <= m; j++) {
        //         if(j==n+1||j==0||i==1||i==n){
        //             System.out.print("* ");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        /*
        5>
                1 
               1 1
              1 2 1
             1 3 3 1
            1 4 6 4 1
         */
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < m - i; j++) {
        //         System.out.print(" ");
        //     }
        //     int num = 1;
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num = num * (i - j) / (j + 1); 
        //     }
        //     System.out.println();
        // }



        /*
        6>
                1 
               1 2
              1 2 3
             1 2 3 4
            1 2 3 4 5
         */
        // for(int i=n;i>=0;i--)
        // {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }        int num = 1;
        //     for (int j = 0; j <= n - i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

    /*
    7>
        1111
        222
        33
        4
    */
    // int num = 1;
    // for (int i = n; i >= 1; i--) {
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print(num);
    //     }
    //     num++;
    //     System.out.println();
    // }
}    
}
