public class hollowbutterfly {
    public static void main(String[] args) {
        
        int n=4;
        int m=5;

    
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
            int s=2*(n-1);
            int s1 = 0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    if(j==1||j==i){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                for(int k=1; k<=s;k++)
                {
                    System.out.print("  ");
                }
                s=s-2;
                for(int j=1;j<=i;j++)
                {
                    if(j==n||j==i||j==1){
                        System.out.print(" *");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    if(j==1||j==i){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                for(int k=1; k<=s1;k++)
                {
                    System.out.print("  ");
                }
                s1=s1+2;
                for (int j = 1; j <= i; j++) {
                    if(j==n||j==i||j==1){
                        System.out.print(" *");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    
    
    }    
    }
    