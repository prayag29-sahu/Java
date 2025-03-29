
public class righthalf01 {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        
                /*
                10>
                
                1 
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1
                
                */
        
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if ((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                            System.out.print(0+" ");
                }
        
            }
            System.out.println();
        }
    }
}
