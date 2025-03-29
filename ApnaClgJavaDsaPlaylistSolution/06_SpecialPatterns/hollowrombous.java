public class hollowrombous {
    public static void main(String[] args) {
        
        int n=4;
        int m=5;

    
            /*
                4>
                       * * * * * * 
                     *         *
                   *         *
                 * * * * * *
             */
            for(int i=n;i>=1;i--)
            {
                for (int j = 1; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= m; j++) {
                    if(j==n+1||j==0||i==1||i==n){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    
    
    
    
    }    
    }
    