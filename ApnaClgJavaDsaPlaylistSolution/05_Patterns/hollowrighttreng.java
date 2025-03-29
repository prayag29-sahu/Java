
public class hollowrighttreng {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

                /*
            15>
             * 
             * *
             *   *
             *     *
             * * * * *
        
         */
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i||i==m){
                    System.out.print("* ");  
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
