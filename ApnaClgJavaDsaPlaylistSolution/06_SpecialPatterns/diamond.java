public class diamond {
    public static void main(String[] args) {
        
        int n=4;
        int m=5;

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
            for(int i=m;i>=1;i--)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<=m-i;k++)
                {
                    System.out.print(" *");
                }
                System.out.println();
            }
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<=m-i;k++)
                {
                    System.out.print(" *");
                }
                System.out.println();
            }
    

    }    
    }
    